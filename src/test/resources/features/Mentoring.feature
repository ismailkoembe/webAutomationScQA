

Scenario: MENTORING
Given I navigate to login page
And I login "tracker user"
And I skip phone collection
Then I navigate home page
And I click Real Age Test button
When I take Real Age Test
Then I should be able to see my result
And I wait "100" sec