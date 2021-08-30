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

/**
 * Item
 *
 * @author <a href="mailto:marouane.trab@gmail.com">Marouane Trabelsi</a>
 * @version 1.0
 */
public class Item
{
    private int order;
    private String name;

    public Item( int order, String name )
    {
        this.order = order;
        this.name = name;
    }

    public int getOrder()
    {
        return order;
    }

    public void setOrder( int order )
    {
        this.order = order;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }
}
