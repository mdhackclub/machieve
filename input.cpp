#include <iostream>
#include <regex>
#include <stdexcept>

#include "input.hpp"

std::string input(std::string prompt) {
	std::string response;
	std::cout << prompt;
	std::cin >> response;
	return response;
}

std::string input(std::string prompt, std::string pattern) {
	std::string response;
	// response = input(prompt);
	std::cout << prompt;
	std::cin >> response;
	if(!std::regex_match(response, std::regex(pattern)) {
		return response;
	} else {
		throw std::invalid_argument("Malformed response. Try again.");
	}
}
