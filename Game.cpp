#include <iostream>

#include "Game.hpp"
#include "input.hpp"

void Game::Game() {

}

void Game::welcome() {
	std::cout << "Hello and welcome!" << std::endl;
	std::cout << "The old king is dead. You are now in control of the country." << std::endl;
	name = input("What is your name?");
	std::cout << "Welcome, " << name << "! The Kingdom is waiting!" << std::endl;
}

bool Game::still_alive() {

}

void Game::step() {
	year++;
	std::cout << "Year: " << year << "A.D." << std::endl;
	
}

void Game::begin() {
	
}

void Game::war() {
	
}
