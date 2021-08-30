/**
 * Copyright 2015 Wise Brains
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.github.tmarwen.xstream.list;

import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.Iterator;
import java.util.List;

/**
 * ListOfItems
 *
 * @author <a href="mailto:marouane.trab@gmail.com">Marouane Trabelsi</a>
 * @version 1.0
 */
public class Package
{
    @XStreamImplicit( itemFieldName = "item" )
    private List< Item > items;

    public void setItems( List< Item > items )
    {
        this.items = items;
    }

    public List< Item > getItems()
    {
        return items;
    }
}
