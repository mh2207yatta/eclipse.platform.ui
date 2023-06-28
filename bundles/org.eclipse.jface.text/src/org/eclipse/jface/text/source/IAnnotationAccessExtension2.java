/*******************************************************************************
 * Copyright (c) 2006, 2008 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jface.text.source;

import org.eclipse.jface.text.quickassist.IQuickAssistAssistant;


/**
 * Extension interface for {@link org.eclipse.jface.text.source.IAnnotationAccess}.<p>
 * This interface allows clients to set a quick assist assistant.
 *
 * @see org.eclipse.jface.text.source.IAnnotationAccess
 * @since 3.2
 */
public interface IAnnotationAccessExtension2 {

	/**
	 * Provides this annotation access with a quick assist assistant that
	 * is used to decide whether the quick fix image should be shown.
	 *
	 * @param assistant the quick assist assistant
	 */
	void setQuickAssistAssistant(IQuickAssistAssistant assistant);

}
