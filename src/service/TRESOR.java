package service;

public enum TRESOR {
	RIEN,
	BOMBUP,
	FIREUP,
	WALLPASS,
	BOMBEPASS,
	FIRESUIT,
	
	SPEED_UP, //va 2x plus vite, cumulatif
	DETONATOR,// faire exploser la plus vieille bombe
	BOMB_KICK,// donne un coup de pied dans une bombe pour la déplacer
	PUSH//pousse l'autre d'une case
}
