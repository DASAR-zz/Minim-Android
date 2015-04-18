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
 * A Bartlett window function.
 *
 * @author Damien Di Fede
 * @author Corban Brook
 * @see   <a href="http://en.wikipedia.org/wiki/Window_function#Bartlett_window_.28zero_valued_end-points.29">The Bartlett Window</a>
 * 
 * @invisible
 */
public class BartlettWindow extends WindowFunction
{
  /** Constructs a Bartlett window. */
  public BartlettWindow()
  {
  }

  protected float value(int length, int index) 
  {
      return 2f / (length - 1) * ((length - 1) / 2f - Math.abs(index - (length - 1) / 2f));
  }
  
  public String toString()
  {
	  return "Bartlett Window";
  }
}

