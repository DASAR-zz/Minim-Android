# Minim-Android
This is project contains **part** of Java Minim audio library which can be used on Android.

**For now all classes with unsatisfied dependency removed.** 

You can use this project with audio decoders or Android native classes like AudioRecorder or any other source of PCM audio for analysis or audio effects.

This project contains packages: 
* [ddf.minim.analysis](http://code.compartmental.net/minim/javadoc/ddf/minim/analysis/package-summary.html) (FFT, DFT, BeatDetection, etc)
* ddf.minim.effects (BandPass, HighPass,LowPass, Notch, Chebyshev filter, etc)
* [ddf.minim.ugens](http://code.compartmental.net/minim/javadoc/ddf/minim/ugens/package-summary.html) (sound generators, effects, envelopes, etc)
* javax.sound.\* renamed to ddf.minim.javax.sound.\*
* ddf.minim.javasound (**cuted a lot**)
* ddf.minim.signals
* ddf.minim.spi

## Convert Android PCM 16 bit audio to 32 bit interleaved float.

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

#Usage

Add to your project as Eclipse library project.

#License
Minim and this project is licensed under the GNU Lesser General Public License (LGPL)