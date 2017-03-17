#ifndef GAME_HPP
#define GAME_HPP

#include <string>
// #include <map>

class Game {
	int year;
	// std::map<std::string, >
	int power, economy, popularity, religion, military, balance, foreign;
	std::string name;
public:
	void Game();
	void load();
	void welcome();
	bool still_alive();
	void step();
	void begin();
	void war();
}

#endif // GAME_HPP
