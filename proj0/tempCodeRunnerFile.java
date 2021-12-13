		// double T = Double.parseDouble(args[0]); //stack overflow
		// double dt = Double.parseDouble(args[1]); //stack overflow
		// String filename = args[2];

		// double radius = readRadius(filename);
		// Planet[] planets = readPlanets(filename);

		// /** Finished parsing universe info from input file **/

		// StdDraw.setScale(-radius, radius);
		// StdDraw.clear();
		// StdDraw.picture(0, 0, "images/starfield.jpg");
		
		// // for (Planet body : planets) {
		// // 	body.draw();
		// // }

		
		// double time = 0;

		// while ( time < T) {

			

		// 	double[] xForces = new double[planets.length];
		// 	double[] yForces = new double[planets.length];

		// 	for (int i = 0; i < planets.length; i++) {
		// 		xForces[i] = planets[i].calcNetForceExertedByX(planets);
		// 		yForces[i] = planets[i].calcNetForceExertedByY(planets);
		// 	}

		// 	for (int i = 0; i < planets.length; i++) {
		// 		planets[i].update(dt, xForces[i], yForces[i]);
		// 	}

		// 	StdDraw.picture(0, 0, "images/starfield.jpg");
			
		
		// 	// for (Planet body : planets) {
		// 	// 	body.draw();
		// 	// }

		// 	sleep(10);
		// 	time += dt;

		// }