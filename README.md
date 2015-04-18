# Minim-Android
This is project contains part of Java Minim library which can be used on Android.

This project contains whole ddf.minim.analysis packege whith things like FFT and BeatDetection.


# Convert Android PCM 16 bit audio to 32 bit interleaved float.

/**
* Convert 16bit short[] audio to 32 bit float format.
* From [-32768,32768] to [-1,1] 
* @param audio
* @return
*/
private float[] shortToFloat(short[] audio) {

  float[] converted = new float[audio.length];

	for (int i = 0; i < converted.length; i++) {
		// [-3276,32768] -> [-1,1]
		converted[i] = audio[i] / 32768f;
	}

	return converted;
}
