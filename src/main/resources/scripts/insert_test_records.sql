# USE bomb_reporter_db;
# USE bomb_reporter_db;
#
# INSERT INTO categories(id, name)
#     VALUE (1, 'aerial_bombs'),
#     (2, 'landmines'),
#     (3, 'grenades'),
#     (4, 'missiles_rockets'),
#     (5, 'projectiles_mortars'),
#     (6, 'miscellaneous');
#
#
#
# INSERT INTO location(id, latitude, longitude)
# VALUES (0, '21.906124', '21.906134');
#
# INSERT INTO reports(id, more_details)
# VALUES (0, 'here goes extra details');
#
#
#
# INSERT INTO uxo_location(id, uxo_location, reports_id)
# VALUES (0, 1, 1);
#
# INSERT INTO uxo_status(id, uxo_status, uxo_reports)
# VALUES (0, 'verified', 1);
#
#
# # INSERT INTO uxo_description(id, size, img_file_path, color, quantity, secondary_color, reports_id)
# # VALUES (0, 'm', 'image path', 'blue', 2, 'red', 1);
# INSERT INTO description(id, size, img_file_path, color, quantity, secondary_color)
# VALUES (0, 'm', 'file path', 'blue', 2, 'red');
#
# INSERT INTO uxo_description(id, uxo_description, reports_id)
# VALUES (0, 1, 1);
#
# INSERT INTO uxo_categories(id, uxo_categories, reports_id)
# VALUES (0, 1, 1);
#
#

USE bomb_reporter_db;
SELECT * FROM uxo_location l
WHERE l.uxo_location = '19.0398153';



USE bomb_reporter_db;
SELECT reports_id FROM uxo_location l
JOIN location l2 on l2.id = l.uxo_location
WHERE latitude = '19.0398153';