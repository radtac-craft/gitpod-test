Feature: Stock Maintenance
	In order to maintain the library stock
	As a librarian
	I want to add books and inspect overall stock

	Scenario: New libraries are empty
		Given a new library
		Then the library should be empty
		