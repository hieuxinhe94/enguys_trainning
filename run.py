import os,glob
       
_dir = "/home/pvh/Desktop/Test/"
files=""
os.chdir(_dir)
for file in glob.glob("*.txt"):
        files =  str(file)
print "txt: %s"  %str(_dir)
print files
data = ""
with open(files,'r') as test_file:
        data = test_file.read()
i = 0
arr_head     = ["fit","fit_type","sleeve_cut","back_detail","yoke","placket","collar","pocket","sleeve_type"]
arr_child=['slim', 'regular_tucked', 'regular_tucked','back_ext'
        ," dart"
        ," box_pleat_wedge"
        ,"box_pleat_rectangle"
        ,"side_pleats_wedge"
        ," side_pleats_rectangle","..."]
arr_level3 = [" back_ext"," right_breast:","left_right_breast:"," left_breast","gusset_untucked"," regular_untucked:"," back_ext:","..."]
arr_level4 = ["style:"," long_sleeve:"," short_sleeve:","back_ext:","..."]
arr_level5 = ["pointed","ext"," straight:","rounded","...","angled"]

TAG = []*(len(arr_head))  
arr = [None]*len(arr_head)
for line in data.splitlines():
       for i in range(0,len(arr_head),1):
                   if  arr_head[i-1] in line :
                        print "Khach hang chon option root\t"
                      #  print line 
                        for j in range(0,len(arr_child),1):
                                                if  arr_child[i-1] in line :
                                                        print "Khach hang chon option child \t"
                                                    #    print line 
                                                        for k in range(0,len(arr_level3),1):
                                                                if arr_level3[i-1] in line  :
                                                                                print " option %s"              %str( arr_child[i-1]) 
                                                                                print "level is : %s "             %str(arr_level3[i-1])            
                                                                                for t in range(0,len(arr_level4),1):
                                                                                             if arr_level3[i-1] in line  :
                                                                                                    print " option %s"              %str( arr_level3[i-1]) 
                                                                                                    print "level is : %s "             %str(arr_level4[i-1])        
                                                                                                    for x in range(0,len(arr_level5),1):           
                                                                                                                    if arr_level5[i-1] in line  :
                                                                                                                              print " option %s"              %str( arr_level4[i-1]) 
                                                                                                                              print "level is : %s "             %str(arr_level5[i-1])                                                                                       
# i+1 is length of lists[1] or use len(lists[1])


