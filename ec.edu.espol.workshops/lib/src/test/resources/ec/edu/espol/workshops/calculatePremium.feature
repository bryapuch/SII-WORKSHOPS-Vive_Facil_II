Feature:Calculate the insurance prime for a customer

	 Scenario: The customer is a 50 years old, married, man and with a license
	 Given Is 45 years old, married, man, with a license
	 When the premium is calculated
	 Then Show 200
	 
	 Scenario: The customer is a 25 years old, married, woman and with a license
	 Given Is 25 years old, married, woman, with a license
	 When the premium is calculated
	 Then Show 300
	 
	 Scenario: The customer is a 35 years old,not married, man and without a license
	 Given Is 35 years old, not married, man, without a license
	 When the premium is calculated
	 Then Show -1
	 
	 Scenario Outline: The Insurance Car
	 Given Is "<years_old>", "<married>", "<gender>","<license>"
	 When the premium is calculated
	 Then Show "<answer>"
	 
	 
	Examples:
	 | years_old | married | gender | license | answer |
	 | 50 		 | true    |male    | true    | 200    |
	 | 25 		 | true    |female  | true    | 200    |
	 | 35 		 | false   |male    | false   | -1     |
	 
		 