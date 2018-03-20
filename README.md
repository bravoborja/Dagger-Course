## Ejercicio Curso Dagger

Para la realización del ejercicio habrá que crear dos vistas ("Main" y "Detail" con sus correspondientes Activity y Fragment). La vista Main simplemente tendrá un botón para poder acceder al detalle.
Para hacer uso de lo aprendido durante el curso, tendremos que crear lo siguiente:

- Crear una clase que nos permita pasar de un Activity a otro
- Crear distintos scopes para Activity y Fragment
- Crear un Presenter para cada una de las vistas y manejar sus dependencias con @Binds o @Provides
- Crear el componente y el módulo de App
- Crear los módulos por cada una de las vistas
- Usar @ContributesAndroidInjector para manejar donde se inyectan las dependencias

Cada uno de los Presenter simplemente mostrará un Toast. Lo que se quiere conseguir es que se entiendan bien los conceptos básicos de Dagger e implementar una pequeña arquitectura base que podría servir para cualquier proyecto por muy simple que pueda parecer teniendo solo dos vistas.

Se podrá hacer uso de HasActivityInjector y HasFragmentInjector o, en su defecto, DaggerApplication, DaggerActivity y DaggerFragment