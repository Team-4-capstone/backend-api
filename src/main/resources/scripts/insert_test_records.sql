INSERT INTO location(id, latitude, longitude)
VALUES (1, '48.877491', '28.02372'),
       (2, '47.336021', '33.588818'),
       (3, '50.178595', '30.4924884'),
       (4, '46.755678', '36.7887623');
#        (5, '50.5206777', '30.2448725'),
#        (6, '47.628132', '35.505749'),
#        (7, '47.628132', '35.505749'),
#        (8, '48.278042', '26.195181'),
#        (9, '50.5189093', '30.6145526'),
#        (10, '49.9923181', '36.2310146'),
#        (11, '47.0957648', '37.5499621'),
#        (12, '48.01068', '37.50449'),
#        (13, '50.4512974', '30.50552771');

INSERT INTO categories(id, category)
VALUES (1, 'Missiles/Rockets'),
       (2, 'Miscellaneous'),
       (3, 'Projectiles/Mortars'),
       (4, 'Landmines');
#        (5, 'landmines'),
#        (6, 'missiles/rockets'),
#        (7, 'miscellaneous'),
#        (8, 'aerial bombs'),
#        (9, 'missiles/rockets'),
#        (10, 'miscellaneous'),
#        (11, 'grenades'),
#        (12, 'miscellaneous'),
#        (13, 'missles/rockets');

INSERT INTO description(id, size, color, IMG_PATH, quantity, secondary_color)
VALUES (1, 'Lg', 'Gray', 'https://oceans2.s3.us-east-2.amazonaws.com/missiles.png', '1',
        'None'),
       (2, 'Sm', 'Green',
        'https://oceans2.s3.us-east-2.amazonaws.com/other.png', '3',
        'None'),
       (3, 'Md', 'Green', 'https://oceans2.s3.us-east-2.amazonaws.com/og7.jpeg', '1', 'None'),
       (4, 'Md', 'Green', 'https://oceans2.s3.us-east-2.amazonaws.com/landmine.png', '1',
        'None');
#        (5, 'sm', 'green', 'https://oceans2.s3.us-east-2.amazonaws.com/Screen+Shot+2022-06-08+at+16.11.41.png', '1',
#         'none'),
#        (6, 'lg', 'gray', c '1',
#         'red'),
#        (7, 'sm', 'gray', 'https://oceans2.s3.us-east-2.amazonaws.com/Screen+Shot+2022-06-16+at+13.42.01.png', '1',
#         'none'),
#        (8, 'lg', 'white', 'https://oceans2.s3.us-east-2.amazonaws.com/Screen+Shot+2022-06-16+at+13.42.01.png', '1',
#         'none'),
#        (9, 'lg', 'green', 'https://oceans2.s3.us-east-2.amazonaws.com/Screen+Shot+2022-06-16+at+13.42.01.png', '1',
#         'none'),
#        (10, 'md', 'green', 'https://oceans2.s3.us-east-2.amazonaws.com/Screen+Shot+2022-06-16+at+13.42.01.png', '1',
#         'none'),
#        (11, 'sm', 'green', 'https://oceans2.s3.us-east-2.amazonaws.com/Screen+Shot+2022-06-16+at+13.42.01.png', '3',
#         'none'),
#        (12, 'md', 'silver', 'https://oceans2.s3.us-east-2.amazonaws.com/Screen+Shot+2022-06-16+at+13.42.01.png', '1',
#         'none'),
#        (13, 'lg', 'white', 'https://oceans2.s3.us-east-2.amazonaws.com/Screen+Shot+2022-06-16+at+13.42.01.png', '1',
#         'none');

INSERT INTO status(id, status)
VALUES (1, 'Unverified'),
       (2, 'Unverified'),
       (3, 'Verified'),
       (4, 'Unverified');
#        (5, 'unverified'),
#        (6, 'unverified'),
#        (7, 'unverified'),
#        (8, 'unverified'),
#        (9, 'unverified'),
#        (10, 'unverified'),
#        (11, 'unverified'),
#        (12, 'unverified'),
#        (13, 'unverified');

INSERT INTO reports(id, more_details)
VALUES (1,
        'I found it by a building. Looks to be about 2 meters in length'),
       (2,
        'This was on the side of the road. This is approximately 200 meters from a school. Unsure if it has explosives still or not.'),
       (3,
        'This is the Russian 58mm PG-16 (????-16), a high-explosive anti-tank fin-stabilised with tracer (HEAT-FS-T), self-destruct (SD), surface-to-surface, shoulder-launched, recoilless rocket.

The point-initiating base-detonating (PIBD) fuze consists of a piezoelectric crystal PI element and a setback-armed BD element containing a self-destruct feature.

This system uses a streamlined HEAT rocket with a powerful HMX high-explosive (HE) filling to give an anti-armour performance similar to that achieved by the 57mm S-5 HEAT and HEAT/fragmentation Air-to-Ground rockets.

The fuzing mechanism to the PG-16 rocket (Grom) is similar to that used on the PG-7 series of HEAT rockets used with the RPG-7 launcher (ie. PIBD Piezo Electric) with self-destruct mechanism.

When the rocket is fired and leaves the launcher the sustainer motor is ignited and blows off the booster motor, which is ejected to the rear.

The rocket has 6 spring out fins to stabilise it in flight and two tracer elements.

Compared to the contemporary PG-7, the PG-16 provides greater effective range and better accuracy, due to the smaller calibre warhead and more powerful rocket booster.'),
       (4,
        'I at first thought it was a rock. Then I saw that it looked like something plastic. It is black on top. I did not move it. It is on a walking path.');
#        (5,
#         'This is the Russian MON-90, a high-explosive (HE), claymore shaped, plastic-bodied, directional, anti-personnel (AP) landmine which is designed to wound or kill by its fragmentation. The landmine is similar in appearance to the MON-50 but is almost twice the size with a much greater depth. It has an attachment point on the bottom for connecting a special clamp which can be attached to wood, metal etc but it has no scissor-type legs. It has a sight centred on the top which is flanked by two detonator cavities. The landmine contains 6.2kg of RDX (PVV-5A) to propel approximately 2000 steel rod fragments to a lethal range of 90 metres in a 54'' arc (spread of 60m at a 90m range). The MON-90 is usually command actuated using a PN manual inductor and an EDP-R electric detonator. It can also be actuated by a variety of boobytrap switches including the MUV series pull, the MVE-72 electric break-wire or the VP13 seismic controller.'),
#        (6,
#         'This is the Russian 122mm 9M22S (9M22C), an incendiary, forward-ejection, electrically initiated, surface-to-surface, fin and spin stabilised rocket launched from the BM-21 Grad truck-mounted multiple rocket launcher systems normally used against personnel and flammable targets. The basic variant rocket is designated the 9M22 with other types of warhead installed including chemical, incendiary, smoke or submunitions. The 9M22S payload (9N510) consists of 180 un-fuzed incendiary elements which are ignited on ejection by an ignition/expelling charge of six linear shaped-charges (LSC). The incendiary elements are ML-5 magnesium cups filled with a thermite-type mixture and packed in a matrix, each element having a burning time of at least 2 minutes. The total weight of the incendiary elements is assessed to be 5.9 kilograms (13.0 pounds). The 9M22S warhead is painted light grey and has a red band.'),
#        (7,
#         'This is the Russian ML-5, the incendiary element from the 9N510 warhead of the 122mm 9M22S Grad rocket. Fired by the BM-21 Grad multiple launch rocket system and similar systems the ML-5 is designed to create large fires in areas of vegetation and other flammable materials. These incendiary elements are hexagonal prisms made of magnesium alloy ML-5 and are filled with a pyrotechnic composition. Each element has a burning time of at least 2 minutes. The 9M22S payload (9N510) consists of 180 un-fuzed incendiary elements which are ignited on ejection by an ignition/expelling charge of six linear shaped-charges (LSC). The ML-5 incendiary elements are magnesium cups filled with a thermite-type mixture and packed in a matrix within the 9N510 warhead. On dispersal, the visual effect of these flammable submunitions are often confused with phosphorus munitions.'),
#        (8,
#         'This is the Russian FAB-500 ShN (??????-500??H), a modern design, high-explosive (HE), parachute retarded, blast bomb, specially designed for dropping from low altitude, which is thin cased and designed to produce a destructive effect through blast overpressure and some casualties at long distance by the fragmentation of the casing. The casing of the bomb is approximately 10mm thick but the rounded ogive or nose section is considerably thicker, as is the base plate forward of the tail section, to add strength. There is a thin inner casing, with diamond-shaped projections, designed to assist the breakup of the casing into optimum sized pieces. The tail section, which is hollow, is aluminium no more than 4 mm thick and contains the parachute retarding mechanism. The tail section is secured to the bomb body by a number of bolts. FAB (??????) stands for fugasnaya aviabomba meaning `aerial demolition bomb. Russia makes extensive use of thin-walled weapons with a high explosive/casing ratio.'),
#        (9,
#         'This is the Russian SS-21 Scarab, the NATO designation for the 9M79 Tochka a short-range ballistic missile (SRBM) weapon system with a single-stage, solid-propellant, fin-spin-stabilised, inertially guided, aerodynamically controlled, surface-to-surface missile (SSM). These missiles are designed to deliver nuclear, conventional, chemical, or possibly biological warheads. The missile may contain a unitary or a submunition warhead. Missiles with a unitary conventional warhead contain a laser fuzing system with impact backup. All other missiles contain a radar altimeter fuze with impact backup. The Terminally Guided Submunition (TGSM) warhead has a radar altimeter fuze. Each Unguided Submunition (UGSM) contains an impact fuze with a delay timer backup Three variant warheads include the high-explosive fragmentation 9M123F (482kg), the 9M123K containing 50 x 9N24 submunitions and the 9M79B nuclear warhead.'),
#        (10,
#         'This is the Russian PTM-1S (????M-1C), also known as the PGMDM (????M??M - Protivo-Gutsenitsnaja Mina Distantsionava Minirovanija) a dispenser ejected scatterable, high-explosive (HE), anti-vehicle (AV), self-destruct, with a green plastic casing, blast landmine. The landmine can be scattered from helicopters or submunition warheads from the BM-21 (122mm) or the Uragan (220mm) rocket systems. After ejection from the scattering system, a pyrotechnic element arms the landmine (following a 30-second delay), initiates a clockwork self-destruct delay timer and releases a safety block enabling the landmine pressure sensor to function. Longitudinally inside the landmine is a pressure tube that transmits pressure to the fuze. The landmine is 338mm long and is made of very thin flexible plastic containing approximately 1.5kg of liquid explosive (PVV-12S). A cylindrical housing at one end of the landmine contains the clockwork self-destruct timer (2-hour increments to a maximum of 24 hours).'),
#        (11,
#         'This is the Russian RGO (Ruchnaya Granata Oboronitel''naya), a high explosive (HE), anti-personnel (AP), defensive, fragmentation, hand grenade. It consists of a double-layered steel pre-fragmented body. It is very similar to the single-layered defensive aluminium-bodied RGN hand grenade. The UDZ-S fuze has both impact and time delay functions, the impact fuze arms after a pyrotechnic delay of 1 to 1.8 seconds. If the grenade strikes an object after this time a spherical lead shot filled impact weight will trigger detonation. If the grenade has not struck anything after 3.5 to 4 seconds the second pyrotechnic delay will detonate the grenade. The grenade is currently in production in Russia and Ukraine and is in service with a number of other countries. Although fitted with a fly-off lever retained by a safety pin, inside the fuze are three pyrotechnic delay trains and an all-ways acting mechanism containing an inertia ball.'),
#        (12,
#         'This is the Russian 3B30 (3??30), a cylindrical, ribbon armed, dual-purpose, high-explosive anti-tank (HEAT) submunition with a 200 second self-destruct (SD) fuze designed to destroy lightly armoured vehicles, infantry fighting vehicles, armoured personnel carriers, self-propelled guns, manpower, aircraft and helicopters in form-up locations. The submunition, when in the delivery munition is 62.5mm long, but when deployed it springs open and is approximately 110mm long (providing a stand-off distance). Penetration is achieved by the shaped-charge (SC), claimed to be 100mm at 30 degrees angle of incidence. Each 152mm 3-O-33 projectile contains 42 submunitions in 6 rows, 7 submunitions per row. It is also used in multiple launch rocket systems via the 122mm 9M218 rocket (45 submunitions) and the 300mm 9M55K5 Smerch (646 submunitions). The 3B30 submunition is of the dual-purpose improved conventional munition (DPICM) type, combining anti-personnel and anti-armour effects by employing both a shaped-charge (SC) and fragmentation effects.'),
#        (13,
#         'This is the Russian AA-10 Alamo, the NATO designation for the R-27 medium-to-long-range air-to-air high explosive (HE) missile. The R-27 is manufactured in infrared-homing (R-27T), semi-active-radar-homing (R-27R) and active-radar-homing (R-27EA) versions, in both Russia and Ukraine. AA-10 Alamo has four fixed chamfered rectangular canards at the nose, four large trapezoidal butterfly moving control fins and four fixed clipped-tip delta-wings at the rear. The guidance system for mid-course is inertial with command updates for the semi-active and active radar-guided versions. The IR-guided versions have no inertial guidance or command updates and have to be locked onto the target before launch. The four extended-range and long-range missile versions have longer and larger diameter rocket motor assemblies. The earlier short-range versions R-27T and R-27R, have 33kg expanding rod warheads. All the other versions have a 39kg expanding rod warhead and active radar fuzes, but the R-27EM has a modified fuze located behind the trapezoidal fins for low-level intercepts.');


INSERT INTO uxo_categories(id, uxo_categories, reports_id)
VALUES (1, 1, 1),
       (2, 2, 2),
       (3, 3, 3),
       (4, 4, 4);
#        (5, 5, 5),
#        (6, 6, 6),
#        (7, 7, 7),
#        (8, 8, 8),
#        (9, 9, 9),
#        (10, 10, 10),
#        (11, 11, 11),
#        (12, 12, 12),
#        (13, 13, 13);

INSERT INTO uxo_location(id, uxo_location, reports_id)
VALUES (1, 1, 1),
       (2, 2, 2),
       (3, 3, 3),
       (4, 4, 4);
#        (5, 5, 5),
#        (6, 6, 6),
#        (7, 7, 7),
#        (8, 8, 8),
#        (9, 9, 9),
#        (10, 10, 10),
#        (11, 11, 11),
#        (12, 12, 12),
#        (13, 13, 13);

INSERT INTO uxo_description(id, uxo_description, reports_id)
VALUES (1, 1, 1),
       (2, 2, 2),
       (3, 3, 3),
       (4, 4, 4);
#        (5, 5, 5),
#        (6, 6, 6),
#        (7, 7, 7),
#        (8, 8, 8),
#        (9, 9, 9),
#        (10, 10, 10),
#        (11, 11, 11),
#        (12, 12, 12),
#        (13, 13, 13);
INSERT INTO uxo_status(id, uxo_status, reports_id)
VALUES (1, 1, 1),
       (2, 2, 2),
       (3, 3, 3),
       (4, 4, 4);
#        (5, 5, 5),
#        (6, 6, 6),
#        (7, 7, 7),
#        (8, 8, 8),
#        (9, 9, 9),
#        (10, 10, 10),
#        (11, 11, 11),
#        (12, 12, 12),
#        (13, 13, 13);

INSERT INTO posts(id, content, created_at)
VALUES (0, 'Be safe out there!', '2022-02-24'),
       (0, 'Is it still there?', '2022-04-26'),
       (0, 'Thanks for all the info!', '2022-05-13');

INSERT INTO uxo_posts(id, uxo_posts, reports_id)
VALUES (1, 1, 1),
       (2, 2, 1),
       (3, 3, 2);
