#include <iostream>
#include <regex>

#include "input.hpp"

std::string input(std::string prompt) {
	std::string response;
	std::cout << prompt;
	std::cin >> response;
	return response;
}
