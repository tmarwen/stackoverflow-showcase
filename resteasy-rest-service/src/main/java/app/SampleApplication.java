/**
 * Copyright 2016 Wise Brains
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package app;

import services.MessageRestService;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * app
 *
 * @author <a href="mailto:marouane.trab@gmail.com">Marouane Trabelsi</a>
 * @version 1.0
 */
@ApplicationPath( "/rest" )
public class SampleApplication extends Application
{

    private static final Set< Object > singletons = new HashSet< Object >();

    public SampleApplication()
    {
        singletons.add( new MessageRestService() );
    }

    @Override
    public Set< Class< ? > > getClasses()
    {
        HashSet< Class< ? > > set = new HashSet< Class< ? > >();
        return set;
    }

    @Override
    public Set< Object > getSingletons()
    {
        return singletons;
    }

}
