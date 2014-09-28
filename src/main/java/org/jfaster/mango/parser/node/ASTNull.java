/*
 * Copyright 2014 mango.jfaster.org
 *
 * The Mango Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.jfaster.mango.parser.node;

import org.jfaster.mango.parser.Parser;
import org.jfaster.mango.parser.ParserVisitor;
import org.jfaster.mango.support.RuntimeContext;

public class ASTNull extends AbstractExpression {

    private static Object value = null;

    public ASTNull(int id) {
        super(id);
    }

    public ASTNull(Parser p, int id) {
        super(p, id);
    }

    @Override
    public boolean evaluate(RuntimeContext context) {
        return false;
    }

    @Override
    public Object value(RuntimeContext context) {
        return value;
    }

    @Override
    public Object jjtAccept(ParserVisitor visitor, Object data)
    {
        return visitor.visit(this, data);
    }

}