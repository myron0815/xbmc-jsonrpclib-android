/* ***************************************************************************
 * Copyright (c) 2013 SKIDATA AG, Austria.
 *
 * This software is the confidential and proprietary information of
 * SKIDATA AG, Austria. You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SKIDATA AG.
 *
 * SKIDATA MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE
 * SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
 * A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SKIDATA SHALL
 * NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING,
 * MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 *****************************************************************************/

package org.xbmc.android.jsonrpc.generator;

import java.io.File;

/**
 * Created on : 19. Feb. 2016 / 09:51:09 Created from : mamk Project : generator
 */
public class Main {

    public static void main(String[] args) {
        Introspect.generate(new File("."), new File("target\\gen"));
    }

}
