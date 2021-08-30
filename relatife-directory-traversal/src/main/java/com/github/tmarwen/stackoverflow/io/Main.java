package com.github.tmarwen.stackoverflow.io; /**
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

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * com.github.tmarwen.stackoverflow.io.Main
 *
 * @author <a href="mailto:marouane.trab@gmail.com">Marouane Trabelsi</a>
 * @version 1.0
 */
public class Main
{
    public static void main( String[] args ) throws URISyntaxException, IOException
    {
        String targetFileName = null;
        if ( args.length == 1 )
        {
            targetFileName = args[ 0 ];
        }
        else
        {
            targetFileName = "target_traversal_dir";
        }

        File currentDir = new File( "." );
        File targetDir = null;
        if (currentDir.isDirectory())
        {
            File parentDir = currentDir.getCanonicalFile().getParentFile();
            targetDir = new File( parentDir, targetFileName );

            if ( targetDir.exists() )
            {
                listDirectoryFiles( targetDir.toPath(), false );
            }
            else
            {
                System.out.println( String.format( "File '%s' does not exist. Exiting...",
                        targetDir.getAbsolutePath() ) );
            }
        }
    }

    private static void listDirectoryFiles( Path path, boolean hasParent ) throws IOException
    {
        DirectoryStream<Path> dirStream = Files.newDirectoryStream( path );
        for ( Path p : dirStream )
        {
            final boolean isDirectory = p.toFile().isDirectory();
            System.out.println( ( hasParent && isDirectory ? "   " : "+__" ) + p.getFileName() );
            if ( isDirectory )
            {
                listDirectoryFiles( p, true);
            }
        }
    }
}
