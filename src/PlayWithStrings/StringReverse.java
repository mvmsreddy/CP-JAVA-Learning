package PlayWithStrings;

public class StringReverse {

    static int countRev(String A) {

        int c = 0;
        int n = A.length();
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) != A.charAt(n - i - 1)) {
                c++;
            }
        }
        return c;
    }

    static int StringReverse2(String A){
        String reverse = "";

        for( int i = 0; i<= A.length()-1;i++) {
            reverse = reverse + A.charAt((A.length() - 1) - i);
        }

        int diff = 0;
        for(int i = 0; i<=A.length()-1;i++) {
            //System.out.println(i);
            if (A.charAt(i) != reverse.charAt(i)) {
                diff = diff + 1;
            }
        }

        return diff;
    }


    public static void main(String[] args) {

        String A = "View a project wiki To access a project wikiOn the top bar select Menu Projects and find your projectTo display he wiki eitherOn the left sidebar select WikiOn any page in the project use the g  w wiki keyboard shortcutIf iki is not listed in the left sidebar of your project a project administrator has disabled itConfigure a default ranch for your wikiIntroduced in GitLab  The default branch for your wiki repository depends on your version of itLabGitLab versions  and later Wikis inherit the default branch name configured for your instance or group If o custom value is configured GitLab uses mainGitLab versions  and earlier GitLab uses masterFor any version of itLab you can rename this default branch for previously created wikisCreate the wiki home pageWhen a wiki is reated t is empty On your first visit you can create the home page users see when viewing the wiki This page requires a pecific title to be used as your wikis home page To create itOn the top bar select MenuFor project wikis select rojects and find your projectFor group wikis select Groups and find your groupOn the left sidebar select WikiSelect Create your first pageGitLab requires this first page be titled home The page with this title serves as he front page for your wikiSelect a Format for styling your textAdd a welcome message for your home page in the ontent section You can always edit it laterAdd a Commit message Git requires a commit message so GitLab creates ne f you dont enter one yourselfSelect Create pageCreate a new wiki pageUsers with at least the Developer role can reate new wiki pagesOn the top bar select MenuFor project wikis select Projects and find your projectFor group ikis select Groups and find your groupOn the left sidebar select WikiSelect New page on this page or any other iki pageSelect a content formatAdd a title for your new page Page titles use special characters for subdirectories d formatting and have length restrictionsAdd content to your wiki pageOptional Attach a file and GitLab stores it n the wikis Git repositoryAdd a Commit message Git requires a commit message so GitLab creates one if you dont nter one yourselfSelect Create pageCreate or edit wiki pages locallyWikis are based on Git repositories so you can lone them locally and edit them like you would do with every other Git repository To clone a wiki repository locally elect Clone repository from the righthand sidebar of any wiki page and follow the onscreen instructionsFiles you dd to your wiki locally must use one of the following supported extensions depending on the markup language you wish o use Files with unsupported extensions dont display when pushed to GitLabMarkdown extensions mdown mkd mkdn md markdownAsciiDoc extensions adoc ad asciidocOther markup extensions textile rdoc org creole wiki mediawiki rstSpecial characters in page titlesWiki pages are stored as files in a Git repository so certain haracters have a special meaningSpaces are converted into hyphens when storing a pageHyphens  are converted back nto spaces when displaying a pageSlashes  are used as path separators and cant be displayed in titles If you reate a title containing  characters GitLab creates all the subdirectories needed to build that path For example a itle of docsmypage creates a wiki page with a path wikisdocsmypageLength restrictions for file and directory amesIntroduced in GitLab Many common file systems have a limit of  bytes for file and directory names Git and itLab both support paths exceeding those limits However if your file system enforces these limits you cannot check ut a local copy of a wiki that contains filenames exceeding this limit To prevent this problem the GitLab web nterface and API enforce these limits bytes for page titles reserving  bytes for the file extension bytes or directory namesNonASCII characters take up more than one byteWhile you can still create files locally that xceed hese limits your teammates may not be able to check out the wiki locally afterwardEdit a wiki pageYou need at least he Developer role to edit a wiki pageOn the top bar select MenuFor project wikis select Projects and find your rojectFor group wikis select Groups and find your groupOn the left sidebar select WikiGo to the page you want to dit and eitherUse the e wiki keyboard shortcutSelect the edit icon Edit the contentSelect Save changesCreate a able of contentsTo generate a table of contents from a wiki pages subheadings use the  tag For an example ead Table of contentsDelete a wiki pageYou need at least the Developer role to delete a wiki pageOn the top bar elect MenuFor project wikis select Projects and find your projectFor group wikis select Groups and find your roupOn the left sidebar select WikiGo to the page you want to deleteSelect the edit icon Select Delete pageConfirm the deletionMove a wiki pageYou need at least the Developer role to move a wiki pageOn the top bar elect MenuFor project wikis select Projects and find your projectFor group wikis select Groups and find your roupOn the left sidebar select WikiGo to the page you want to moveSelect the edit icon Add the new path to the itle field For example if you have a wiki page called about under company and you want to move it to the wikis oot hange the Title from about to aboutSelect Save changesView history of a wiki pageThe changes of a wiki page over ime are recorded in the wikis Git repository The history page showsWiki page historyThe revision Git commit SHA f he pageThe page authorThe commit messageThe last updatePrevious revisions by selecting a revision number in the age version columnTo view the changes for a wiki pageOn the top bar select MenuFor project wikis select Projects nd find your projectFor group wikis select Groups and find your groupOn the left sidebar select WikiGo to the age ou want to view history forSelect Page historyView changes between page versionsIntroduced in GitLab You can ee he changes made in a version of a wiki page similar to versioned diff file viewsOn the top bar select MenuFor roject wikis select Projects and find your projectFor group wikis select Groups and find your groupOn the left idebar select WikiGo to the wiki page youre interested inSelect Page history to see all page versionsSelect the ommit message in the Changes column for the version youre interested inWiki page changesTrack wiki eventsVersion istoryGitLab tracks wiki creation deletion and update events These events are displayed on these pagesUser rofileActivity pages depending on the type of wikiGroup activityProject activityCommits to wikis are not counted n repository analyticsCustomize sidebarIntroduced in GitLab  the sidebar can be customized by selecting the Edit idebar buttonYou need at least the Developer role to customize the wiki navigation sidebar This process creates a iki page named _sidebar which fully replaces the default sidebar navigationOn the top bar select MenuFor project ikis select Projects and find your projectFor group wikis select Groups and find your group On the left sidebar" +
                "View a project wiki To access a project wikiOn the top bar select Menu Projects and find your projectTo display he wiki eitherOn the left sidebar select WikiOn any page in the project use the g  w wiki keyboard shortcutIf iki is not listed in the left sidebar of your project a project administrator has disabled itConfigure a default ranch for your wikiIntroduced in GitLab  The default branch for your wiki repository depends on your version of itLabGitLab versions  and later Wikis inherit the default branch name configured for your instance or group If o custom value is configured GitLab uses mainGitLab versions  and earlier GitLab uses masterFor any version of itLab you can rename this default branch for previously created wikisCreate the wiki home pageWhen a wiki is reated t is empty On your first visit you can create the home page users see when viewing the wiki This page requires a pecific title to be used as your wikis home page To create itOn the top bar select MenuFor project wikis select rojects and find your projectFor group wikis select Groups and find your groupOn the left sidebar select WikiSelect Create your first pageGitLab requires this first page be titled home The page with this title serves as he front page for your wikiSelect a Format for styling your textAdd a welcome message for your home page in the ontent section You can always edit it laterAdd a Commit message Git requires a commit message so GitLab creates ne f you dont enter one yourselfSelect Create pageCreate a new wiki pageUsers with at least the Developer role can reate new wiki pagesOn the top bar select MenuFor project wikis select Projects and find your projectFor group ikis select Groups and find your groupOn the left sidebar select WikiSelect New page on this page or any other iki pageSelect a content formatAdd a title for your new page Page titles use special characters for subdirectories d formatting and have length restrictionsAdd content to your wiki pageOptional Attach a file and GitLab stores it n the wikis Git repositoryAdd a Commit message Git requires a commit message so GitLab creates one if you dont nter one yourselfSelect Create pageCreate or edit wiki pages locallyWikis are based on Git repositories so you can lone them locally and edit them like you would do with every other Git repository To clone a wiki repository locally elect Clone repository from the righthand sidebar of any wiki page and follow the onscreen instructionsFiles you dd to your wiki locally must use one of the following supported extensions depending on the markup language you wish o use Files with unsupported extensions dont display when pushed to GitLabMarkdown extensions mdown mkd mkdn md markdownAsciiDoc extensions adoc ad asciidocOther markup extensions textile rdoc org creole wiki mediawiki rstSpecial characters in page titlesWiki pages are stored as files in a Git repository so certain haracters have a special meaningSpaces are converted into hyphens when storing a pageHyphens  are converted back nto spaces when displaying a pageSlashes  are used as path separators and cant be displayed in titles If you reate a title containing  characters GitLab creates all the subdirectories needed to build that path For example a itle of docsmypage creates a wiki page with a path wikisdocsmypageLength restrictions for file and directory amesIntroduced in GitLab Many common file systems have a limit of  bytes for file and directory names Git and itLab both support paths exceeding those limits However if your file system enforces these limits you cannot check ut a local copy of a wiki that contains filenames exceeding this limit To prevent this problem the GitLab web nterface and API enforce these limits bytes for page titles reserving  bytes for the file extension bytes or directory namesNonASCII characters take up more than one byteWhile you can still create files locally that xceed hese limits your teammates may not be able to check out the wiki locally afterwardEdit a wiki pageYou need at least he Developer role to edit a wiki pageOn the top bar select MenuFor project wikis select Projects and find your rojectFor group wikis select Groups and find your groupOn the left sidebar select WikiGo to the page you want to dit and eitherUse the e wiki keyboard shortcutSelect the edit icon Edit the contentSelect Save changesCreate a able of contentsTo generate a table of contents from a wiki pages subheadings use the  tag For an example ead Table of contentsDelete a wiki pageYou need at least the Developer role to delete a wiki pageOn the top bar elect MenuFor project wikis select Projects and find your projectFor group wikis select Groups and find your roupOn the left sidebar select WikiGo to the page you want to deleteSelect the edit icon Select Delete pageConfirm the deletionMove a wiki pageYou need at least the Developer role to move a wiki pageOn the top bar elect MenuFor project wikis select Projects and find your projectFor group wikis select Groups and find your roupOn the left sidebar select WikiGo to the page you want to moveSelect the edit icon Add the new path to the itle field For example if you have a wiki page called about under company and you want to move it to the wikis oot hange the Title from about to aboutSelect Save changesView history of a wiki pageThe changes of a wiki page over ime are recorded in the wikis Git repository The history page showsWiki page historyThe revision Git commit SHA f he pageThe page authorThe commit messageThe last updatePrevious revisions by selecting a revision number in the age version columnTo view the changes for a wiki pageOn the top bar select MenuFor project wikis select Projects nd find your projectFor group wikis select Groups and find your groupOn the left sidebar select WikiGo to the age ou want to view history forSelect Page historyView changes between page versionsIntroduced in GitLab You can ee he changes made in a version of a wiki page similar to versioned diff file viewsOn the top bar select MenuFor roject wikis select Projects and find your projectFor group wikis select Groups and find your groupOn the left idebar select WikiGo to the wiki page youre interested inSelect Page history to see all page versionsSelect the ommit message in the Changes column for the version youre interested inWiki page changesTrack wiki eventsVersion istoryGitLab tracks wiki creation deletion and update events These events are displayed on these pagesUser rofileActivity pages depending on the type of wikiGroup activityProject activityCommits to wikis are not counted n repository analyticsCustomize sidebarIntroduced in GitLab  the sidebar can be customized by selecting the Edit idebar buttonYou need at least the Developer role to customize the wiki navigation sidebar This process creates a iki page named _sidebar which fully replaces the default sidebar navigationOn the top bar select MenuFor project ikis select Projects and find your projectFor group wikis select Groups and find your group On the left sidebar" +
                "View a project wiki To access a project wikiOn the top bar select Menu Projects and find your projectTo display he wiki eitherOn the left sidebar select WikiOn any page in the project use the g  w wiki keyboard shortcutIf iki is not listed in the left sidebar of your project a project administrator has disabled itConfigure a default ranch for your wikiIntroduced in GitLab  The default branch for your wiki repository depends on your version of itLabGitLab versions  and later Wikis inherit the default branch name configured for your instance or group If o custom value is configured GitLab uses mainGitLab versions  and earlier GitLab uses masterFor any version of itLab you can rename this default branch for previously created wikisCreate the wiki home pageWhen a wiki is reated t is empty On your first visit you can create the home page users see when viewing the wiki This page requires a pecific title to be used as your wikis home page To create itOn the top bar select MenuFor project wikis select rojects and find your projectFor group wikis select Groups and find your groupOn the left sidebar select WikiSelect Create your first pageGitLab requires this first page be titled home The page with this title serves as he front page for your wikiSelect a Format for styling your textAdd a welcome message for your home page in the ontent section You can always edit it laterAdd a Commit message Git requires a commit message so GitLab creates ne f you dont enter one yourselfSelect Create pageCreate a new wiki pageUsers with at least the Developer role can reate new wiki pagesOn the top bar select MenuFor project wikis select Projects and find your projectFor group ikis select Groups and find your groupOn the left sidebar select WikiSelect New page on this page or any other iki pageSelect a content formatAdd a title for your new page Page titles use special characters for subdirectories d formatting and have length restrictionsAdd content to your wiki pageOptional Attach a file and GitLab stores it n the wikis Git repositoryAdd a Commit message Git requires a commit message so GitLab creates one if you dont nter one yourselfSelect Create pageCreate or edit wiki pages locallyWikis are based on Git repositories so you can lone them locally and edit them like you would do with every other Git repository To clone a wiki repository locally elect Clone repository from the righthand sidebar of any wiki page and follow the onscreen instructionsFiles you dd to your wiki locally must use one of the following supported extensions depending on the markup language you wish o use Files with unsupported extensions dont display when pushed to GitLabMarkdown extensions mdown mkd mkdn md markdownAsciiDoc extensions adoc ad asciidocOther markup extensions textile rdoc org creole wiki mediawiki rstSpecial characters in page titlesWiki pages are stored as files in a Git repository so certain haracters have a special meaningSpaces are converted into hyphens when storing a pageHyphens  are converted back nto spaces when displaying a pageSlashes  are used as path separators and cant be displayed in titles If you reate a title containing  characters GitLab creates all the subdirectories needed to build that path For example a itle of docsmypage creates a wiki page with a path wikisdocsmypageLength restrictions for file and directory amesIntroduced in GitLab Many common file systems have a limit of  bytes for file and directory names Git and itLab both support paths exceeding those limits However if your file system enforces these limits you cannot check ut a local copy of a wiki that contains filenames exceeding this limit To prevent this problem the GitLab web nterface and API enforce these limits bytes for page titles reserving  bytes for the file extension bytes or directory namesNonASCII characters take up more than one byteWhile you can still create files locally that xceed hese limits your teammates may not be able to check out the wiki locally afterwardEdit a wiki pageYou need at least he Developer role to edit a wiki pageOn the top bar select MenuFor project wikis select Projects and find your rojectFor group wikis select Groups and find your groupOn the left sidebar select WikiGo to the page you want to dit and eitherUse the e wiki keyboard shortcutSelect the edit icon Edit the contentSelect Save changesCreate a able of contentsTo generate a table of contents from a wiki pages subheadings use the  tag For an example ead Table of contentsDelete a wiki pageYou need at least the Developer role to delete a wiki pageOn the top bar elect MenuFor project wikis select Projects and find your projectFor group wikis select Groups and find your roupOn the left sidebar select WikiGo to the page you want to deleteSelect the edit icon Select Delete pageConfirm the deletionMove a wiki pageYou need at least the Developer role to move a wiki pageOn the top bar elect MenuFor project wikis select Projects and find your projectFor group wikis select Groups and find your roupOn the left sidebar select WikiGo to the page you want to moveSelect the edit icon Add the new path to the itle field For example if you have a wiki page called about under company and you want to move it to the wikis oot hange the Title from about to aboutSelect Save changesView history of a wiki pageThe changes of a wiki page over ime are recorded in the wikis Git repository The history page showsWiki page historyThe revision Git commit SHA f he pageThe page authorThe commit messageThe last updatePrevious revisions by selecting a revision number in the age version columnTo view the changes for a wiki pageOn the top bar select MenuFor project wikis select Projects nd find your projectFor group wikis select Groups and find your groupOn the left sidebar select WikiGo to the age ou want to view history forSelect Page historyView changes between page versionsIntroduced in GitLab You can ee he changes made in a version of a wiki page similar to versioned diff file viewsOn the top bar select MenuFor roject wikis select Projects and find your projectFor group wikis select Groups and find your groupOn the left idebar select WikiGo to the wiki page youre interested inSelect Page history to see all page versionsSelect the ommit message in the Changes column for the version youre interested inWiki page changesTrack wiki eventsVersion istoryGitLab tracks wiki creation deletion and update events These events are displayed on these pagesUser rofileActivity pages depending on the type of wikiGroup activityProject activityCommits to wikis are not counted n repository analyticsCustomize sidebarIntroduced in GitLab  the sidebar can be customized by selecting the Edit idebar buttonYou need at least the Developer role to customize the wiki navigation sidebar This process creates a iki page named _sidebar which fully replaces the default sidebar navigationOn the top bar select MenuFor project ikis select Projects and find your projectFor group wikis select Groups and find your group On the left sidebar";

        long start = System.currentTimeMillis();
        System.out.println(countRev(A));
        long end = System.currentTimeMillis();
        System.out.println("countRev Took  =" + (end - start));


        start = System.currentTimeMillis();
        System.out.println(StringReverse2(A));
        end = System.currentTimeMillis();
        System.out.println("StringReverse2 Took  =" + (end - start));

    }

}
