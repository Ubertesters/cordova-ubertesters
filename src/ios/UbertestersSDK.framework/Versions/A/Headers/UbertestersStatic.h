//
//  UbertestersStatic.h
//  Ubertesters
//
//  Created by alexey.levchenko on 6/16/14.
//  Copyright (c) 2014 Anton Chuev. All rights reserved.
//

extern "C" {
    void initUbertesters();
    void initUbertestersWithOptions(int options);
    void UTLog(const char* message, int logLevel);
    void makeScreenshot();
    void showMenu();
    void hideMenu();
}

