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

import com.thoughtworks.xstream.XStream;

import java.util.ArrayList;
import java.util.List;

/**
 * MainSerizalization
 *
 * @author <a href="mailto:marouane.trab@gmail.com">Marouane Trabelsi</a>
 * @version 1.0
 */
public class MainSerialization
{
    public static void main( String[] args )
    {
        Item itemOne = new Item( 0, "item-1" );
        Item itemTwo = new Item( 1, "item-2" );

        List<Item> items = new ArrayList< Item >();
        items.add( itemOne );
        items.add( itemTwo );

        Package pakage = new Package();
        pakage.setItems( items );

        XStream xstream = new XStream();
        xstream.alias( "package", Package.class );
        xstream.processAnnotations( Package.class );
        String abc = xstream.toXML( pakage );
        System.out.println( abc );
    }
}
