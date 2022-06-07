USE bomb_reporter_db;USE bomb_reporter_db;


INSERT INTO categories(aerial_bombs, landmines, grenades, missiles_rockets, projectiles_mortars, miscellaneous)
VALUES ('aerial_bomb', 'landmines', 'grenades', 'missiles', 'projectiles', 'other');


INSERT INTO location(id, latitude, longitude)
VALUES (0, '21.906124', '21.906134');

INSERT INTO reports(id, more_details)
VALUES (0, 'here goes extra details');



INSERT INTO uxo_location(id, uxo_location, reports_id)
VALUES (0, 1, 1);

INSERT INTO uxo_status(id, uxo_status, uxo_reports)
VALUES (0, 'verified', 1);


INSERT INTO uxo_description(id, size, img, color, quantity, secondary_color, reports_id)
VALUES (0, 'm', 'image path', 'blue', 2, 'red', 1);

INSERT INTO uxo_categories(id, uxo_report_id, category_id)
VALUES (0, 1, 1);


