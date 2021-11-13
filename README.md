# ApppenjelOTP
![Logo](https://sms.appenjel.com/assets/img/logo.png)

Get Registration from here.
1. Registration https://sms.appenjel.com
2. Login from postman
   Postman https://www.postman.com/
![Postman login](https://tinyimg.io/i/eKD0LUN.png)
3. Keep the authorized token in a secure place.
![Authorized Token](https://tinyimg.io/i/g2Ry1oz.png)
4. To get balance direct phone call/WhatsApp +8801710188764
## [Pricing & more info](PRICING.md)



## gradle
### Add it in your root build.gradle at the end of repositories:
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
### Add the dependency

	dependencies {
	        implementation 'com.github.ais-pro:ApppenjelOTP:Tag'
	}
  

## [maven,sbt,einingen installation](INSTALL.md)


# Usage:
```java
        AppenjelOTP appenjelOTP = new AppenjelOTP();
        appenjelOTP.SetAuthToken("your API token here");

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("number", "01710188764");
            jsonObject.put("mask_type", "none_masking");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        appenjelOTP.send(getApplicationContext(), jsonObject, new VolleyCallbackJson() {
            @Override
            public void OnSuccessResponse(JSONObject response) {
                Log.d("match",""+ appenjelOTP.Match("11225"));
            }
        });
```
  
  


  
