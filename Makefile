CC = g++
CFLAGS = -g -Wall

machieve: main.cpp 
	$(CC) $(CFLAGS) -o machieve main.o

main.o:
	$(CC) $(CFLAGS) -c main.cpp

clean:
  $(RM) count *.o *~
