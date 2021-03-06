/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.util.Modules;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.xtext.example.stateconstrainttransition.StateConstraintTransitionRuntimeModule;
import org.xtext.example.stateconstrainttransition.StateConstraintTransitionStandaloneSetup;
import org.xtext.example.stateconstrainttransition.web.StateConstraintTransitionWebModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class StateConstraintTransitionWebSetup extends StateConstraintTransitionStandaloneSetup {
  private final Provider<ExecutorService> executorServiceProvider;
  
  @Override
  public Injector createInjector() {
    final StateConstraintTransitionRuntimeModule runtimeModule = new StateConstraintTransitionRuntimeModule();
    final StateConstraintTransitionWebModule webModule = new StateConstraintTransitionWebModule(this.executorServiceProvider);
    Modules.OverriddenModuleBuilder _override = Modules.override(runtimeModule);
    Module _with = _override.with(webModule);
    return Guice.createInjector(_with);
  }
  
  public StateConstraintTransitionWebSetup(final Provider<ExecutorService> executorServiceProvider) {
    super();
    this.executorServiceProvider = executorServiceProvider;
  }
}
