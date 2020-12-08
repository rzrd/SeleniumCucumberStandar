@NRITest
Feature: NRI Test
	Testing for NRI screening QA position
  
	Background: 
	Given Initiate browser

	@Test1
	Scenario: Test NRi
		Given Open "demo.automationtesting.in" URL on any browser
		When Click on Skip Sign in button
		And Navigate to register page
		And Fill all the fields
		And Click on submit button
		And Navigate to webtable menu
		And Edit, delete a record from webtable
		And Navigate to SwitchTo
		And Click the button to display the alertbox
		And Click on alert
		And Navigate to Interactions->Drag and Drop->static
		And Drag selenium logo
		Then Exit the test