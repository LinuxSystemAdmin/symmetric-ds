/*
 * SymmetricDS is an open source database synchronization solution.
 *
 * Copyright (C) Andrew Wilcox <andrewbwilcox@users.sourceforge.net>   
 * Copyright (C) Chris Henson <chenson42@users.sourceforge.net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see
 * <http://www.gnu.org/licenses/>.
 */

package org.jumpmind.symmetric.extract.csv;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

abstract class AbstractStreamDataCommand implements IStreamDataCommand {
    protected static final String DELIMITER = Util.DELIMITER;
    protected Log logger = LogFactory.getLog(getClass());
}