HttpHeaders headers = new HttpHeaders();
applyAPIKeyToHeader(key, headers);
headers.setContentType(MediaType.APPLICATION_JSON);
String data = getTextToTranslate(textToTranslate, sourceLanguage, destinationLanguage);
HttpEntity<String> request = new HttpEntity<String>(data, headers);
String url = "www.url.com";
ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
String responseBody = response.getBody();
translationResult = objectMapper.readValue(responseBody, TranslationsResult.class);
