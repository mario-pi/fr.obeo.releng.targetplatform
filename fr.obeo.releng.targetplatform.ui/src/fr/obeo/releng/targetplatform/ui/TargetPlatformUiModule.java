/*
 * generated by Xtext
 */
package fr.obeo.releng.targetplatform.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategyProvider;

import fr.obeo.releng.targetplatform.ui.editor.autoedit.TargetPlatformAutoEditStrategyProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class TargetPlatformUiModule extends fr.obeo.releng.targetplatform.ui.AbstractTargetPlatformUiModule {
	public TargetPlatformUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends AbstractEditStrategyProvider> bindAbstractEditStrategyProvider() {
		return TargetPlatformAutoEditStrategyProvider.class;
	}
}