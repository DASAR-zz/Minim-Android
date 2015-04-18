/*
 *  Copyright (c) 2007 - 2008 by Damien Di Fede <ddf@compartmental.net>
 *
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU Library General Public License as published
 *   by the Free Software Foundation; either version 2 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Library General Public License for more details.
 *
 *   You should have received a copy of the GNU Library General Public
 *   License along with this program; if not, write to the Free Software
 *   Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

package ddf.minim.analysis; 

/**
 * A Cosine window function.
 *
 * @author Damien Di Fede
 * @author Corban Brook
 * @see   <a href="http://en.wikipedia.org/wiki/Window_function#Cosine_window">The Cosine Window</a>
 * 
 * @invisible
 */
public class CosineWindow extends WindowFunction
{
  /** Constructs a Cosine window. */
  public CosineWindow()
  {
  }

  protected float value(int length, int index) 
  {
    return (float) (Math.cos(Math.PI * index / (length - 1) - Math.PI / 2));
  }
  
  public String toString()
  {
	  return "Cosine Window";
  }
}
