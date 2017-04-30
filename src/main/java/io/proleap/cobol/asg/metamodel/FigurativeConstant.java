/*
 * Copyright (C) 2017, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel;

import io.proleap.cobol.Cobol85Parser.FigurativeConstantContext;

public interface FigurativeConstant extends CobolDivisionElement {

	public enum Type {
		ALL, HIGH_VALUE, HIGH_VALUES, LOW_VALUE, LOW_VALUES, NULL, NULLS, QUOTE, QUOTES, SPACE, SPACES, ZERO, ZEROES, ZEROS
	}

	@Override
	FigurativeConstantContext getCtx();

	Type getType();
}
