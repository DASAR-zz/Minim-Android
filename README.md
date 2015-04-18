# Minim-Android
This is project contains part of Java Minim audio library which can be used on Android.

This project contains whole [ddf.minim.analysis](http://code.compartmental.net/minim/javadoc/ddf/minim/analysis/package-summary.html) packege whith things like FFT, DFT and Beat Detection.

# Convert Android PCM 16 bit audio to 32 bit interleaved float.

```java
/**
* Convert 16bit short[] audio to 32 bit float format.
* From [-32768,32768] to [-1,1] 
* @param audio
*/
private float[] shortToFloat(short[] audio) {

    float[] converted = new float[audio.length];

    for (int i = 0; i < converted.length; i++) {
	    // [-3276,32768] -> [-1,1]
	    converted[i] = audio[i] / 32768f;
    }

	return converted;
}
```

#License
Minim and this project is licensed under the GNU Lesser General Public License (LGPL)