/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.stateconstrainttransition.idea.lang;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class StateConstraintTransitionFileTypeFactory extends FileTypeFactory {

	@Override
	public void createFileTypes(@NotNull FileTypeConsumer consumer) {
		consumer.consume(StateConstraintTransitionFileType.INSTANCE, AbstractStateConstraintTransitionFileType.DEFAULT_EXTENSION);
	}

}