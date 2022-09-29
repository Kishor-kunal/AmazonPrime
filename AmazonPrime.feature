@Author:AmazonPrime mobile App
@tag
feature: validate the amazonPrime Mobile app login and search feature
@tag1
@Scenario: validate login and search functionality of app
Given I launch the Amazon prime mobile app in mobile
And I enter credentials to login to the amazon prime app
when I click on login button able to navigate to home page
Then I should able to search the movie
And I should be able to go to result details page
And I should be able to play the video
And I close the browser