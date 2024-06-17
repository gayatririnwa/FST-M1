player1=input("Enter the player 1 name: ")
player2=input("Enter the player 2 name:")

while True:
    player1_choose= input("Enter player 1 choose from Rock Paper and Scissors: ")
    player2_choose= input("Enter player 2 choose from rock paper and Scissors: ")


    if player1_choose==player2_choose:
        print("tie")
    elif player1_choose=="rock":
        if player2_choose=="scissors":
            print(player1+ " wins by selecting " +player1_choose)
        else:
            print(player2+ " wins by selecting " +player2_choose)
    elif player1_choose=="scissors":
        if player2_choose=="paper":
            print(player1+ " wins by selecting " +player1_choose)
        else:
            print(player2+ " wins by selecting " +player2_choose)
    elif player1_choose=="paper":
        if player2_choose=="rock":
            print(player1+ " wins by selecting " +player1_choose)
        else:
            print(player2+ " wins by selecting " +player2_choose)
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")
    repeat = input("Do you want to play another round? Yes/No: ").lower()
    if(repeat == "yes"):
        pass
    elif(repeat == "no"):
        raise SystemExit
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit