/*
 * The MIT License
 *
 * Copyright 2017 Angel Miguel Garcia Vico <agvico at ujaen.es>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package main;


/**
 * Abstract class that represents an statistical quality measure
 * @author Angel Miguel Garcia Vico <agvico at ujaen.es>
 */
public abstract class QualityMeasure {
    
    /**
     * The name of the quality measure
     */
    protected String name;
    
    /** 
     * The value calculated for the quality measure
     */
    protected double value;
    
    /**
     * It returns the value of the given quality measure.
     * @param t
     * @return 
     */
    public abstract double getValue(ContingencyTable t);
    
    /**
     * It checks that the value of the measure is within the domain of the measure
     * @param value
     * @return 
     */
    public abstract boolean validate(double value);
    
    
    public String toString(){
        return name + " = " + value;
    }
}
