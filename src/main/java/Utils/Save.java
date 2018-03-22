/*
 * Copyright 2018 Simone Kslash Angeletti
 * I'm using the same License of Twitter4J which I used in this project.
 * Twitter4J: http://twitter4j.org/en/index.html
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package Utils;

import java.io.*;
import java.util.List;

/**
 * This class saves the elements of a list passed by param into a file
 * @author Simone Kslash Angeletti
 * @param <E>
 */
public class Save <E>  {
    private FileOutputStream fos;
    private BufferedOutputStream bw;
    private PrintWriter out;

    /**
     * Extract from the list elements each element and save it in a file
     * with a specific path
     * @param elements
     * @param path
     * @throws IOException
     */
    public void saveText(List<E> elements,String path)throws IOException{
        fos= new FileOutputStream(path);
        bw = new BufferedOutputStream(fos);
        out = new PrintWriter(bw);
        int i=0;
        for(E el : elements){
                out.println(elements.get(i));
            i++;
        }

        out.close();
        bw.close();
        fos.close();

    }

}