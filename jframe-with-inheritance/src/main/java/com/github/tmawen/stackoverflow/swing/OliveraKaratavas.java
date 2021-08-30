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
package com.github.tmawen.stackoverflow.swing;

/**
 * OliveraKaratavas
 *
 * @author <a href="mailto:marouane.trab@gmail.com">Marouane Trabelsi</a>
 * @version 1.0
 */
public class OliveraKaratavas
{
  public static void main(String[] args)
  {
    OliveraKaratavas v = new OliveraKaratavas();
//    v.nofaila();
  }

    public void parbaud1(JFrame jFrame, char b, String word, String gatavs)
    {
      int k = 0;
  //    JFrame j = new JFrame();
      while (k < word.length())
      {
        char ch = word.charAt(k);
        if (ch == b)
        {
          gatavs = gatavs.substring(0, k) + ch + gatavs.substring(k + 1);
        }
        k++;
      }
      jFrame.updatee(gatavs);
      System.out.println(gatavs);

    }
}
