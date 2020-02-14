public abstract class AbstractPokemon implements PokemonInterface{
    
	static int pokecount;
	public abstract Pokemon createPokemon(String name, int health, String type);
	public abstract Pokemon pokemonInfo(Pokemon pokemon);
}
