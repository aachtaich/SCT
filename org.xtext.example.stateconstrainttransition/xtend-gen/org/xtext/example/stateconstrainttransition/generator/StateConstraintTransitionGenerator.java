/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.And_state;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.CompositeState;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.ConcernLevel;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.Constraint;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.EndTransition;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.Event;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.EventOccurence;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.FullTransition;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.Model;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.Or_state;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.SimpleConstraintState;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.StartTransition;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.State;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateConstraint;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.StateOccurence;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.Transition;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.Variable;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.multiple;
import org.xtext.example.stateconstrainttransition.stateConstraintTransition.stateNameRef;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class StateConstraintTransitionGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Model> _filter = Iterators.<Model>filter(_allContents, Model.class);
    final Procedure1<Model> _function = (Model it) -> {
      this.generateCSP(it, fsa);
    };
    IteratorExtensions.<Model>forEach(_filter, _function);
  }
  
  public void generateCSP(final Model statemachine, final IFileSystemAccess2 fsa) {
    String _name = statemachine.getName();
    String _plus = (_name + ".mzn");
    CharSequence _generate = this.generate(statemachine);
    fsa.generateFile(_plus, _generate);
  }
  
  public CharSequence generate(final Model statemachine) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("include \"globals.mzn\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("%Declaration of variables");
    _builder.newLine();
    {
      EList<Variable> _variable = statemachine.getVariable();
      for(final Variable variable : _variable) {
        {
          multiple _isMultiInstanciated = variable.getIsMultiInstanciated();
          boolean _equals = Objects.equal(_isMultiInstanciated, null);
          if (_equals) {
            StringConcatenation _TypeAllocation = this.TypeAllocation(variable);
            String _name = variable.getName();
            String _plus = (_TypeAllocation + _name);
            _builder.append(_plus, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          } else {
            StringConcatenation _createCardinalities = this.createCardinalities(variable);
            String _name_1 = variable.getName();
            String _plus_1 = (_createCardinalities + _name_1);
            _builder.append(_plus_1, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("%Flexing constraints from imported models");
    _builder.newLine();
    {
      EList<Constraint> _flexConstraints = statemachine.getFlexConstraints();
      boolean _notEquals = (!Objects.equal(_flexConstraints, null));
      if (_notEquals) {
        StringConcatenation _flexConstraint = this.flexConstraint(statemachine);
        _builder.append(_flexConstraint, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.append("%Declaration of composite states and their Hierarchy");
    _builder.newLine();
    {
      EList<State> _state = statemachine.getState();
      Iterable<SimpleConstraintState> _filter = Iterables.<SimpleConstraintState>filter(_state, SimpleConstraintState.class);
      for(final SimpleConstraintState globalState : _filter) {
        _builder.append("var 0..1:");
        String _name_2 = globalState.getName();
        _builder.append(_name_2, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<State> _state_1 = statemachine.getState();
      Iterable<CompositeState> _filter_1 = Iterables.<CompositeState>filter(_state_1, CompositeState.class);
      for(final CompositeState compositeState : _filter_1) {
        _builder.append("var 0..1:");
        String _name_3 = compositeState.getName();
        _builder.append(_name_3, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        CharSequence _statemachineDeclaration = this.statemachineDeclaration(compositeState);
        _builder.append(_statemachineDeclaration, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<State> _state_2 = statemachine.getState();
      Iterable<CompositeState> _filter_2 = Iterables.<CompositeState>filter(_state_2, CompositeState.class);
      for(final CompositeState compositeState_1 : _filter_2) {
        CharSequence _GetSimpleStateConstraints = this.GetSimpleStateConstraints(compositeState_1);
        _builder.append(_GetSimpleStateConstraints, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.append("%Constraints---------------------------------------------------");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("%on the hierarchy");
    _builder.newLine();
    _builder.newLine();
    {
      EList<State> _state_3 = statemachine.getState();
      Iterable<CompositeState> _filter_3 = Iterables.<CompositeState>filter(_state_3, CompositeState.class);
      for(final CompositeState compositeState_2 : _filter_3) {
        CharSequence _statemachineConstraints = this.statemachineConstraints(compositeState_2);
        _builder.append(_statemachineConstraints, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("%on full transitions");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Transition> _transition = statemachine.getTransition();
      Iterable<FullTransition> _filter_4 = Iterables.<FullTransition>filter(_transition, FullTransition.class);
      for(final FullTransition fullTransition : _filter_4) {
        StringConcatenation _FullTransitionConstraints = this.FullTransitionConstraints(fullTransition);
        _builder.append(_FullTransitionConstraints, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("\t");
    _builder.append("%on start transitions");
    _builder.newLine();
    {
      EList<Transition> _transition_1 = statemachine.getTransition();
      Iterable<StartTransition> _filter_5 = Iterables.<StartTransition>filter(_transition_1, StartTransition.class);
      for(final StartTransition startTransition : _filter_5) {
        StringConcatenation _StartTransitionConstraints = this.StartTransitionConstraints(startTransition);
        _builder.append(_StartTransitionConstraints, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<Constraint> _flexConstraints_1 = statemachine.getFlexConstraints();
      boolean _notEquals_1 = (!Objects.equal(_flexConstraints_1, null));
      if (_notEquals_1) {
        _builder.append("Aintnomore1++");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("solve maximize Flex;");
        _builder.newLine();
      } else {
        _builder.append("solve satisfy;");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public StringConcatenation flexConstraint(final Model statemachine) {
    int count = 1;
    String Flex = "";
    final StringConcatenation builder = new StringConcatenation();
    builder.append("var int: Flex;");
    builder.newLine();
    EList<Constraint> _flexConstraints = statemachine.getFlexConstraints();
    for (final Constraint constraint : _flexConstraints) {
      {
        builder.append((("var 0..1: Flex" + Integer.valueOf(count)) + ";"));
        builder.newLine();
        String _Flex = Flex;
        String _string = "+".toString();
        String _plus = (("Flex" + Integer.valueOf(count)) + _string);
        Flex = (_Flex + _plus);
        builder.append((("constraint Flex" + Integer.valueOf(count)) + " = 1 <-> ("));
        ICompositeNode _node = NodeModelUtils.getNode(constraint);
        String _tokenText = NodeModelUtils.getTokenText(_node);
        String _plus_1 = (_tokenText + ");");
        builder.append(_plus_1);
        builder.newLine();
        count = (count + 1);
      }
    }
    String _string = Flex.toString();
    String _string_1 = Flex.toString();
    int _length = _string_1.length();
    int _minus = (_length - 1);
    CharSequence _subSequence = _string.subSequence(0, _minus);
    String _plus = ("Flex = " + _subSequence);
    String _plus_1 = (_plus + ";");
    builder.append(_plus_1);
    return builder;
  }
  
  public CharSequence statemachineDeclaration(final CompositeState compositeState) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ConcernLevel> _concernlevel = compositeState.getConcernlevel();
      for(final ConcernLevel ConcernLevels : _concernlevel) {
        _builder.append("var 0..1:");
        String _name = ConcernLevels.getName();
        _builder.append(_name, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        {
          EList<State> _state = ConcernLevels.getState();
          Iterable<CompositeState> _filter = Iterables.<CompositeState>filter(_state, CompositeState.class);
          for(final CompositeState compState : _filter) {
            {
              boolean _notEquals = (!Objects.equal(compState, null));
              if (_notEquals) {
                _builder.append("var 0..1:");
                String _name_1 = compState.getName();
                _builder.append(_name_1, "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
                Object _statemachineDeclaration = this.statemachineDeclaration(compState);
                _builder.append(_statemachineDeclaration, "");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        {
          EList<State> _state_1 = ConcernLevels.getState();
          Iterable<SimpleConstraintState> _filter_1 = Iterables.<SimpleConstraintState>filter(_state_1, SimpleConstraintState.class);
          for(final SimpleConstraintState SimpleState : _filter_1) {
            _builder.append("var 0..1:");
            String _name_2 = SimpleState.getName();
            _builder.append(_name_2, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence GetSimpleStateConstraints(final CompositeState compositeState) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ConcernLevel> _concernlevel = compositeState.getConcernlevel();
      for(final ConcernLevel ConcernLevels : _concernlevel) {
        {
          EList<State> _state = ConcernLevels.getState();
          Iterable<CompositeState> _filter = Iterables.<CompositeState>filter(_state, CompositeState.class);
          for(final CompositeState compState : _filter) {
            {
              boolean _notEquals = (!Objects.equal(compState, null));
              if (_notEquals) {
                Object _GetSimpleStateConstraints = this.GetSimpleStateConstraints(compState);
                _builder.append(_GetSimpleStateConstraints, "");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        {
          EList<State> _state_1 = ConcernLevels.getState();
          Iterable<SimpleConstraintState> _filter_1 = Iterables.<SimpleConstraintState>filter(_state_1, SimpleConstraintState.class);
          for(final SimpleConstraintState SimpleState : _filter_1) {
            _builder.append("constraint ");
            String _name = SimpleState.getName();
            _builder.append(_name, "");
            _builder.append(" = 1 -> (");
            StringConcatenation _constraints = this.getConstraints(SimpleState);
            _builder.append(_constraints, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence statemachineConstraints(final CompositeState compositeState) {
    StringConcatenation _builder = new StringConcatenation();
    String sumOfCLinCS = "";
    _builder.newLineIfNotEmpty();
    String sumOfStatesInCL = "";
    _builder.newLineIfNotEmpty();
    String sumOfStatesInCS = "";
    _builder.newLineIfNotEmpty();
    {
      EList<ConcernLevel> _concernlevel = compositeState.getConcernlevel();
      for(final ConcernLevel ConcernLevels : _concernlevel) {
        _builder.append("constraint ");
        String _name = compositeState.getName();
        _builder.append(_name, "");
        _builder.append(" = 1 <-> ");
        String _name_1 = ConcernLevels.getName();
        _builder.append(_name_1, "");
        _builder.append(" = 1;");
        _builder.newLineIfNotEmpty();
        _builder.append(sumOfStatesInCL = "", "");
        _builder.newLineIfNotEmpty();
        _builder.append("constraint ");
        String _name_2 = ConcernLevels.getName();
        _builder.append(_name_2, "");
        _builder.append(" = ");
        CharSequence _sumOfStatesInCL = this.sumOfStatesInCL(ConcernLevels);
        _builder.append(_sumOfStatesInCL, "");
        _builder.append(" ;");
        _builder.newLineIfNotEmpty();
        {
          EList<State> _state = ConcernLevels.getState();
          Iterable<CompositeState> _filter = Iterables.<CompositeState>filter(_state, CompositeState.class);
          for(final CompositeState compState : _filter) {
            {
              boolean _notEquals = (!Objects.equal(compState, null));
              if (_notEquals) {
                Object _statemachineConstraints = this.statemachineConstraints(compState);
                _builder.append(_statemachineConstraints, "");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("constraint ");
    CharSequence _sumOfStatesInCS = this.sumOfStatesInCS(compositeState, sumOfStatesInCS);
    _builder.append(_sumOfStatesInCS, "");
    _builder.append(" =  ");
    String _name_3 = compositeState.getName();
    _builder.append(_name_3, "");
    _builder.append("  * ( ");
    CharSequence _sumOfCLinCS = this.sumOfCLinCS(compositeState);
    _builder.append(_sumOfCLinCS, "");
    _builder.append(" );");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence sumOfCLinCS(final CompositeState compositeState) {
    int count = 0;
    String sumOfCLinCS = "";
    EList<ConcernLevel> _concernlevel = compositeState.getConcernlevel();
    for (final ConcernLevel ConcernLevels : _concernlevel) {
      count = (count + 1);
    }
    EList<ConcernLevel> _concernlevel_1 = compositeState.getConcernlevel();
    for (final ConcernLevel ConcernLevels_1 : _concernlevel_1) {
      if ((count > 1)) {
        String _sumOfCLinCS = sumOfCLinCS;
        String _name = ConcernLevels_1.getName();
        String _plus = (_name + " + ");
        sumOfCLinCS = (_sumOfCLinCS + _plus);
      } else {
        String _sumOfCLinCS_1 = sumOfCLinCS;
        String _name_1 = ConcernLevels_1.getName();
        String _plus_1 = (_name_1 + "  ");
        sumOfCLinCS = (_sumOfCLinCS_1 + _plus_1);
      }
    }
    int _length = sumOfCLinCS.length();
    int _minus = (_length - 2);
    return sumOfCLinCS.subSequence(0, _minus);
  }
  
  public CharSequence sumOfStatesInCL(final ConcernLevel concernLevel) {
    String sumOfStatesInCL = "";
    int count = 0;
    EList<State> _state = concernLevel.getState();
    for (final State state : _state) {
      count = (count + 1);
    }
    EList<State> _state_1 = concernLevel.getState();
    for (final State state_1 : _state_1) {
      if ((count > 1)) {
        String _sumOfStatesInCL = sumOfStatesInCL;
        String _name = state_1.getName();
        String _plus = (_name + " + ");
        sumOfStatesInCL = (_sumOfStatesInCL + _plus);
      } else {
        String _sumOfStatesInCL_1 = sumOfStatesInCL;
        String _name_1 = state_1.getName();
        String _plus_1 = (_name_1 + "  ");
        sumOfStatesInCL = (_sumOfStatesInCL_1 + _plus_1);
      }
    }
    int _length = sumOfStatesInCL.length();
    int _minus = (_length - 2);
    return sumOfStatesInCL.subSequence(0, _minus);
  }
  
  public CharSequence sumOfStatesInCS(final CompositeState compositeState, final String SumStatesInCS) {
    int count = 0;
    String StatesInCS = SumStatesInCS;
    EList<ConcernLevel> _concernlevel = compositeState.getConcernlevel();
    for (final ConcernLevel ConcernLevels : _concernlevel) {
      count = (count + 1);
    }
    EList<ConcernLevel> _concernlevel_1 = compositeState.getConcernlevel();
    for (final ConcernLevel ConcernLevels_1 : _concernlevel_1) {
      if ((count > 1)) {
        String _StatesInCS = StatesInCS;
        String _name = ConcernLevels_1.getName();
        String _plus = (_name + " + ");
        StatesInCS = (_StatesInCS + _plus);
      } else {
        String _StatesInCS_1 = StatesInCS;
        String _name_1 = ConcernLevels_1.getName();
        String _plus_1 = (_name_1 + "  ");
        StatesInCS = (_StatesInCS_1 + _plus_1);
      }
    }
    int _length = StatesInCS.length();
    int _minus = (_length - 2);
    return StatesInCS.subSequence(0, _minus);
  }
  
  public StringConcatenation FullTransitionConstraints(final FullTransition transition) {
    final StringConcatenation builder = new StringConcatenation();
    Event event = transition.getEvent();
    EventOccurence expEvent = event.getEvOcc();
    StateOccurence stateEvent = event.getSttOcc();
    String operator = event.getOperator();
    State targetState = transition.getTargetState();
    State state = transition.getState();
    builder.append("constraint ((");
    boolean _notEquals = (!Objects.equal(expEvent, null));
    if (_notEquals) {
      ICompositeNode _node = NodeModelUtils.getNode(expEvent);
      String _tokenText = NodeModelUtils.getTokenText(_node);
      builder.append(_tokenText);
    }
    boolean _notEquals_1 = (!Objects.equal(operator, null));
    if (_notEquals_1) {
      builder.append(operator);
    }
    boolean _notEquals_2 = (!Objects.equal(stateEvent, null));
    if (_notEquals_2) {
      EList<StateConstraint> _stateExpression = stateEvent.getStateExpression();
      for (final StateConstraint states : _stateExpression) {
        this.compile(states, builder);
      }
    }
    boolean _notEquals_3 = (!Objects.equal(state, null));
    if (_notEquals_3) {
      String _name = state.getName();
      String _plus = (") /\\ (" + _name);
      String _plus_1 = (_plus + "=1 )) -> ");
      String _name_1 = targetState.getName();
      String _plus_2 = (_plus_1 + _name_1);
      String _plus_3 = (_plus_2 + " = 1;");
      builder.append(_plus_3);
    } else {
      String _name_2 = targetState.getName();
      String _plus_4 = (")) -> " + _name_2);
      String _plus_5 = (_plus_4 + " = 1;");
      builder.append(_plus_5);
    }
    builder.newLine();
    return builder;
  }
  
  public StringConcatenation compile(final StateConstraint expression, final StringConcatenation builder) {
    boolean _matched = false;
    if (expression instanceof Or_state) {
      _matched=true;
      StateConstraint _left = ((Or_state)expression).getLeft();
      this.compile(_left, builder);
      builder.append(" \\/ ");
      StateConstraint _ripe = ((Or_state)expression).getRipe();
      this.compile(_ripe, builder);
    }
    if (!_matched) {
      if (expression instanceof And_state) {
        _matched=true;
        StateConstraint _left = ((And_state)expression).getLeft();
        this.compile(_left, builder);
        builder.append(" /\\ ");
        StateConstraint _ripe = ((And_state)expression).getRipe();
        this.compile(_ripe, builder);
      }
    }
    if (!_matched) {
      if (expression instanceof stateNameRef) {
        _matched=true;
        State _value = ((stateNameRef)expression).getValue();
        String _name = _value.getName();
        builder.append(_name);
        builder.append("=1");
      }
    }
    return builder;
  }
  
  public StringConcatenation StartTransitionConstraints(final StartTransition startTransition) {
    final StringConcatenation builder = new StringConcatenation();
    try {
      State _targetState = startTransition.getTargetState();
      EObject _eContainer = _targetState.eContainer();
      EObject _eContainer_1 = _eContainer.eContainer();
      final String CompositeStateNodeString = _eContainer_1.toString();
      String[] nodeWords = CompositeStateNodeString.split(" ");
      final String[] lastWord = new String[1];
      for (final String word : nodeWords) {
        String _string = word.toString();
        lastWord[0] = _string;
      }
      String _get = lastWord[0];
      String _get_1 = lastWord[0];
      int _length = _get_1.length();
      int _minus = (_length - 1);
      String FirstParentCompositeState = _get.substring(0, _minus);
      State _targetState_1 = startTransition.getTargetState();
      final String targetState = _targetState_1.getName();
      builder.append((((("constraint " + FirstParentCompositeState) + " = 1 -> (") + targetState) + " =1 "));
      StringConcatenation _sqStatesofTargetTransition = this.getSqStatesofTargetTransition(startTransition);
      builder.append(_sqStatesofTargetTransition);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        State _targetState_2 = startTransition.getTargetState();
        String _name = _targetState_2.getName();
        String _plus = ("constraint " + _name);
        String _plus_1 = (_plus + " =1; ");
        builder.append(_plus_1);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return builder;
  }
  
  public StringConcatenation getSqStatesofTargetTransition(final StartTransition startTransition) {
    final StringConcatenation builder = new StringConcatenation();
    State _targetState = startTransition.getTargetState();
    EObject _eContainer = _targetState.eContainer();
    EList<EObject> _eContents = _eContainer.eContents();
    final String concernLevel = _eContents.toString();
    String[] nodeWordsCL = concernLevel.split("name: ");
    int ContentSize = 0;
    int GetterCount = 1;
    for (final String word : nodeWordsCL) {
      ContentSize = (ContentSize + 1);
    }
    if ((ContentSize > 2)) {
      builder.append("\\/ ");
      while ((GetterCount < (ContentSize - 1))) {
        {
          String _get = nodeWordsCL[GetterCount];
          String _string = _get.toString();
          String[] _split = _string.split("\\)");
          String _get_1 = _split[0];
          String _plus = (_get_1 + "+");
          builder.append(_plus);
          GetterCount = (GetterCount + 1);
        }
      }
      String _get = nodeWordsCL[(ContentSize - 1)];
      String _string = _get.toString();
      String[] _split = _string.split("\\)");
      String _get_1 = _split[0];
      String _plus = (_get_1 + "= 1);");
      builder.append(_plus);
    } else {
      builder.append(");");
    }
    return builder;
  }
  
  public StringConcatenation EndTransitionConstraints(final EndTransition endTransition) {
    final StringConcatenation builder = new StringConcatenation();
    final State sourceState = endTransition.getSourceState();
    builder.append((" Start Transition : " + sourceState));
    return builder;
  }
  
  public StringConcatenation createCardinalities(final Variable variable) {
    final StringConcatenation builder = new StringConcatenation();
    multiple _isMultiInstanciated = variable.getIsMultiInstanciated();
    EList<String> _maximum = _isMultiInstanciated.getMaximum();
    String _get = _maximum.get(0);
    int _parseInt = Integer.parseInt(_get);
    String _plus = ("array[1.." + Integer.valueOf(_parseInt));
    String _plus_1 = (_plus + "] of ");
    StringConcatenation _TypeAllocation = this.TypeAllocation(variable);
    String _plus_2 = (_plus_1 + _TypeAllocation);
    builder.append(_plus_2);
    return builder;
  }
  
  public StringConcatenation TypeAllocation(final Variable variable) {
    final StringConcatenation builder = new StringConcatenation();
    String _context = variable.getContext();
    boolean _equals = Objects.equal(_context, null);
    if (_equals) {
      builder.append("var ");
    }
    String _domain = variable.getDomain();
    boolean _notEquals = (!Objects.equal(_domain, null));
    if (_notEquals) {
      String _domain_1 = variable.getDomain();
      String _string = _domain_1.toString();
      String _domain_2 = variable.getDomain();
      String _string_1 = _domain_2.toString();
      int _length = _string_1.length();
      int _minus = (_length - 1);
      CharSequence _subSequence = _string.subSequence(1, _minus);
      String _plus = (_subSequence + ":");
      builder.append(_plus);
    } else {
      String _inEnumeration = variable.getInEnumeration();
      boolean _notEquals_1 = (!Objects.equal(_inEnumeration, null));
      if (_notEquals_1) {
        EList<String> _values = variable.getValues();
        String _string_2 = _values.toString();
        EList<String> _values_1 = variable.getValues();
        String _string_3 = _values_1.toString();
        int _length_1 = _string_3.length();
        int _minus_1 = (_length_1 - 1);
        String _substring = _string_2.substring(1, _minus_1);
        String _plus_1 = (_substring + ":");
        builder.append(_plus_1);
      } else {
        String _varType = variable.getVarType();
        boolean _equals_1 = Objects.equal(_varType, "Integer");
        if (_equals_1) {
          builder.append("int:");
        } else {
          String _varType_1 = variable.getVarType();
          boolean _equals_2 = Objects.equal(_varType_1, "Float");
          if (_equals_2) {
            builder.append("float:");
          } else {
            String _varType_2 = variable.getVarType();
            boolean _equals_3 = Objects.equal(_varType_2, "Boolean");
            if (_equals_3) {
              builder.append("0..1:");
            }
          }
        }
      }
    }
    return builder;
  }
  
  public StringConcatenation getConstraints(final SimpleConstraintState simpleConstraintState) {
    int NumberOfConstraints = 0;
    int ArraySetterCount = 0;
    int ArrayReaderCount = 1;
    final StringConcatenation builder = new StringConcatenation();
    EList<Constraint> _constraint = simpleConstraintState.getConstraint();
    for (final Constraint constraint : _constraint) {
      NumberOfConstraints = (NumberOfConstraints + 1);
    }
    String[] ConstraintList = new String[NumberOfConstraints];
    EList<Constraint> _constraint_1 = simpleConstraintState.getConstraint();
    for (final Constraint constraint_1 : _constraint_1) {
      {
        ICompositeNode _node = NodeModelUtils.getNode(constraint_1);
        String _tokenText = NodeModelUtils.getTokenText(_node);
        ConstraintList[ArraySetterCount] = _tokenText;
        ArraySetterCount = (ArraySetterCount + 1);
      }
    }
    String _get = ConstraintList[0];
    String _plus = ("(" + _get);
    String _plus_1 = (_plus + " )");
    builder.append(_plus_1);
    while ((ArrayReaderCount < ArraySetterCount)) {
      {
        builder.append(" /\\");
        String _get_1 = ConstraintList[ArrayReaderCount];
        String _plus_2 = ("(" + _get_1);
        String _plus_3 = (_plus_2 + " )");
        builder.append(_plus_3);
        ArrayReaderCount = (ArrayReaderCount + 1);
      }
    }
    return builder;
  }
}
