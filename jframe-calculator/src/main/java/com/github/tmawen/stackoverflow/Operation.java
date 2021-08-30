package com.github.tmawen.stackoverflow;

/**
 * Operation
 *
 * @author <a href="mailto:marouane.trab@gmail.com">Marouane Trabelsi</a>
 * @version 1.0
 */
public enum Operation
{
  ADD
      {
        @Override
        double apply(double argOne, double argTwo)
        {
          return argOne + argTwo;
        }
      },
  SUBSTRUCT
      {
        @Override
        double apply(double argOne, double argTwo)
        {
          return argOne - argTwo;
        }
      },
  DEVIDE
      {
        @Override
        double apply(double argOne, double argTwo)
        {
          return argOne / argTwo;
        }
      },
  MULTIPLY
      {
        @Override
        double apply(double argOne, double argTwo)
        {
          return argOne * argTwo;
        }
      };

  abstract double apply(double argOne, double argTwo);
}
