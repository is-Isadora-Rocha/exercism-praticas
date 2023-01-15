class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
        //Implemente o método (estático) que usa um valor booleano que indica se o cavaleiro está acordado. 
        //Este método retorna se um ataque rápido pode ser feito com base no estado do cavaleiro. 
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
        //Implemente o método (estático) que usa três valores booleanos, indicando se o cavaleiro, arqueiro e prisioneiro,
        // respectivamente, estão acordados. 
        //O método retorna se o grupo puder ser espionado, com base no estado dos três caracteres.
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
        //Implemente o método (estático) que usa dois valores booleanos, indicando se o arqueiro e o prisioneiro, 
        //respectivamente, estão acordados. 
        //O método retorna se o prisioneiro puder ser sinalizado, com base sobre o estado dos dois caracteres.
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (!knightIsAwake && !archerIsAwake && prisonerIsAwake) || (!archerIsAwake && petDogIsPresent);
        //Os três primeiros parâmetros indicam se o cavaleiro, arqueiro e o prisioneiro, respectivamente, estão acordados. 
        //O último parâmetro indica se O cão de estimação de Annalyn está presente. O método retorna se o prisioneiro puder ser libertado 
        //com base no estado dos três. personagens e a presença de cachorro de estimação de Annalyn.
    }
}
