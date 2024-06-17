player1=input("Enter the player 1 name: ")
player2=input("Enter the player 2 name:")

player1_choose= input("Enter player 1 choose from Rock Paper and Scissors: ")
player2_choose= input("Enter player 2 choose from rock paper and Scissors: ")

if player1_choose==player2_choose:
    print("tie")
elif player1_choose=="Rock":
    if player2_choose=="Scissors":
        print(player1+ " wins by selecting " +player1_choose)
    else:
        print(player2+ " wins by selecting " +player2_choose)
elif player1_choose=="Scissors":
    if player2_choose=="Paper":
        print(player1+ " wins by selecting " +player1_choose)
    else:
         print(player2+ " wins by selecting " +player2_choose)
elif player1_choose=="Paper":
    if player2_choose=="Rock":
        print(player1+ " wins by selecting " +player1_choose)
    else:
        print(player2+ " wins by selecting " +player2_choose)
