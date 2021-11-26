package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmProfile;
import cn.ibizlab.ehr.webapi.dto.PcmProfileDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmProfileMappingImpl implements PcmProfileMapping {

    @Override
    public PcmProfile toDomain(PcmProfileDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmProfile pcmProfile = new PcmProfile();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmProfile.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmProfile.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getGwlb() != null ) {
            pcmProfile.setGwlb( dto.getGwlb() );
        }
        if ( dto.getRLastdiscipline() != null ) {
            pcmProfile.setRLastdiscipline( dto.getRLastdiscipline() );
        }
        if ( dto.getRdsj() != null ) {
            pcmProfile.setRdsj( dto.getRdsj() );
        }
        if ( dto.getWbzzjgdm() != null ) {
            pcmProfile.setWbzzjgdm( dto.getWbzzjgdm() );
        }
        if ( dto.getBloodtype() != null ) {
            pcmProfile.setBloodtype( dto.getBloodtype() );
        }
        if ( dto.getTjqk() != null ) {
            pcmProfile.setTjqk( dto.getTjqk() );
        }
        if ( dto.getRSchoolis211() != null ) {
            pcmProfile.setRSchoolis211( dto.getRSchoolis211() );
        }
        if ( dto.getSzyjtj() != null ) {
            pcmProfile.setSzyjtj( dto.getSzyjtj() );
        }
        if ( dto.getApplicantid() != null ) {
            pcmProfile.setApplicantid( dto.getApplicantid() );
        }
        if ( dto.getRSchoolis985() != null ) {
            pcmProfile.setRSchoolis985( dto.getRSchoolis985() );
        }
        if ( dto.getYzbm() != null ) {
            pcmProfile.setYzbm( dto.getYzbm() );
        }
        if ( dto.getResidencestate() != null ) {
            pcmProfile.setResidencestate( dto.getResidencestate() );
        }
        if ( dto.getXkml() != null ) {
            pcmProfile.setXkml( dto.getXkml() );
        }
        if ( dto.getJzpspyjyy() != null ) {
            pcmProfile.setJzpspyjyy( dto.getJzpspyjyy() );
        }
        if ( dto.getBz() != null ) {
            pcmProfile.setBz( dto.getBz() );
        }
        if ( dto.getCz2() != null ) {
            pcmProfile.setCz2( dto.getCz2() );
        }
        if ( dto.getNf() != null ) {
            pcmProfile.setNf( dto.getNf() );
        }
        if ( dto.getPhaseinfo() != null ) {
            pcmProfile.setPhaseinfo( dto.getPhaseinfo() );
        }
        if ( dto.getGzkssj() != null ) {
            pcmProfile.setGzkssj( dto.getGzkssj() );
        }
        if ( dto.getNqdldhtqx() != null ) {
            pcmProfile.setNqdldhtqx( dto.getNqdldhtqx() );
        }
        if ( dto.getYglxshgz() != null ) {
            pcmProfile.setYglxshgz( dto.getYglxshgz() );
        }
        if ( dto.getHighestdegree() != null ) {
            pcmProfile.setHighestdegree( dto.getHighestdegree() );
        }
        if ( dto.getPcmprofilename() != null ) {
            pcmProfile.setPcmprofilename( dto.getPcmprofilename() );
        }
        if ( dto.getRzqd() != null ) {
            pcmProfile.setRzqd( dto.getRzqd() );
        }
        if ( dto.getCym() != null ) {
            pcmProfile.setCym( dto.getCym() );
        }
        if ( dto.getRpr() != null ) {
            pcmProfile.setRpr( dto.getRpr() );
        }
        if ( dto.getJzbspyjyy() != null ) {
            pcmProfile.setJzbspyjyy( dto.getJzbspyjyy() );
        }
        if ( dto.getYglx() != null ) {
            pcmProfile.setYglx( dto.getYglx() );
        }
        if ( dto.getYwzdjbs() != null ) {
            pcmProfile.setYwzdjbs( dto.getYwzdjbs() );
        }
        if ( dto.getHobbies() != null ) {
            pcmProfile.setHobbies( dto.getHobbies() );
        }
        if ( dto.getElinkurl() != null ) {
            pcmProfile.setElinkurl( dto.getElinkurl() );
        }
        if ( dto.getMobile() != null ) {
            pcmProfile.setMobile( dto.getMobile() );
        }
        if ( dto.getWbzw() != null ) {
            pcmProfile.setWbzw( dto.getWbzw() );
        }
        if ( dto.getPersonnelfileplace() != null ) {
            pcmProfile.setPersonnelfileplace( dto.getPersonnelfileplace() );
        }
        if ( dto.getZtyy() != null ) {
            pcmProfile.setZtyy( dto.getZtyy() );
        }
        if ( dto.getZczs() != null ) {
            pcmProfile.setZczs( dto.getZczs() );
        }
        if ( dto.getCz() != null ) {
            pcmProfile.setCz( dto.getCz() );
        }
        if ( dto.getCadidateid() != null ) {
            pcmProfile.setCadidateid( dto.getCadidateid() );
        }
        if ( dto.getIsblacklistreason() != null ) {
            pcmProfile.setIsblacklistreason( dto.getIsblacklistreason() );
        }
        if ( dto.getQzfj() != null ) {
            pcmProfile.setQzfj( dto.getQzfj() );
        }
        if ( dto.getEducationlevel() != null ) {
            pcmProfile.setEducationlevel( dto.getEducationlevel() );
        }
        if ( dto.getDegreetype() != null ) {
            pcmProfile.setDegreetype( dto.getDegreetype() );
        }
        if ( dto.getHjdz() != null ) {
            pcmProfile.setHjdz( dto.getHjdz() );
        }
        if ( dto.getZplx() != null ) {
            pcmProfile.setZplx( dto.getZplx() );
        }
        if ( dto.getYjsnf() != null ) {
            pcmProfile.setYjsnf( dto.getYjsnf() );
        }
        if ( dto.getAddress() != null ) {
            pcmProfile.setAddress( dto.getAddress() );
        }
        if ( dto.getSyqdqsj() != null ) {
            pcmProfile.setSyqdqsj( dto.getSyqdqsj() );
        }
        if ( dto.getRLastschool() != null ) {
            pcmProfile.setRLastschool( dto.getRLastschool() );
        }
        if ( dto.getRInitializeapplydate() != null ) {
            pcmProfile.setRInitializeapplydate( dto.getRInitializeapplydate() );
        }
        if ( dto.getNativeplace() != null ) {
            pcmProfile.setNativeplace( dto.getNativeplace() );
        }
        if ( dto.getCz5() != null ) {
            pcmProfile.setCz5( dto.getCz5() );
        }
        if ( dto.getCertificatenumber() != null ) {
            pcmProfile.setCertificatenumber( dto.getCertificatenumber() );
        }
        if ( dto.getJzbspyj() != null ) {
            pcmProfile.setJzbspyj( dto.getJzbspyj() );
        }
        if ( dto.getGraduationdate() != null ) {
            pcmProfile.setGraduationdate( dto.getGraduationdate() );
        }
        if ( dto.getSfz() != null ) {
            pcmProfile.setSfz( dto.getSfz() );
        }
        if ( dto.getCertificatetype() != null ) {
            pcmProfile.setCertificatetype( dto.getCertificatetype() );
        }
        if ( dto.getIsblacklist() != null ) {
            pcmProfile.setIsblacklist( dto.getIsblacklist() );
        }
        if ( dto.getOtherfile() != null ) {
            pcmProfile.setOtherfile( dto.getOtherfile() );
        }
        if ( dto.getNation() != null ) {
            pcmProfile.setNation( dto.getNation() );
        }
        if ( dto.getEmail() != null ) {
            pcmProfile.setEmail( dto.getEmail() );
        }
        if ( dto.getIsabroad() != null ) {
            pcmProfile.setIsabroad( dto.getIsabroad() );
        }
        if ( dto.getYgbh() != null ) {
            pcmProfile.setYgbh( dto.getYgbh() );
        }
        if ( dto.getSftgcp() != null ) {
            pcmProfile.setSftgcp( dto.getSftgcp() );
        }
        if ( dto.getJkzk() != null ) {
            pcmProfile.setJkzk( dto.getJkzk() );
        }
        if ( dto.getCsd() != null ) {
            pcmProfile.setCsd( dto.getCsd() );
        }
        if ( dto.getJldspyjyy() != null ) {
            pcmProfile.setJldspyjyy( dto.getJldspyjyy() );
        }
        if ( dto.getPcmydgzmxid() != null ) {
            pcmProfile.setPcmydgzmxid( dto.getPcmydgzmxid() );
        }
        if ( dto.getNl() != null ) {
            pcmProfile.setNl( dto.getNl() );
        }
        if ( dto.getZp() != null ) {
            pcmProfile.setZp( dto.getZp() );
        }
        if ( dto.getNapxmjgwmc() != null ) {
            pcmProfile.setNapxmjgwmc( dto.getNapxmjgwmc() );
        }
        if ( dto.getSfxzy() != null ) {
            pcmProfile.setSfxzy( dto.getSfxzy() );
        }
        if ( dto.getZczs2() != null ) {
            pcmProfile.setZczs2( dto.getZczs2() );
        }
        if ( dto.getGender() != null ) {
            pcmProfile.setGender( dto.getGender() );
        }
        if ( dto.getWorkbegindate() != null ) {
            pcmProfile.setWorkbegindate( dto.getWorkbegindate() );
        }
        if ( dto.getWbgw() != null ) {
            pcmProfile.setWbgw( dto.getWbgw() );
        }
        if ( dto.getWbzz() != null ) {
            pcmProfile.setWbzz( dto.getWbzz() );
        }
        if ( dto.getRCertnames() != null ) {
            pcmProfile.setRCertnames( dto.getRCertnames() );
        }
        if ( dto.getSbsj() != null ) {
            pcmProfile.setSbsj( dto.getSbsj() );
        }
        if ( dto.getGzbt() != null ) {
            pcmProfile.setGzbt( dto.getGzbt() );
        }
        if ( dto.getRtsj() != null ) {
            pcmProfile.setRtsj( dto.getRtsj() );
        }
        if ( dto.getNapxm() != null ) {
            pcmProfile.setNapxm( dto.getNapxm() );
        }
        if ( dto.getXxxz() != null ) {
            pcmProfile.setXxxz( dto.getXxxz() );
        }
        if ( dto.getCz3() != null ) {
            pcmProfile.setCz3( dto.getCz3() );
        }
        if ( dto.getJldspyj() != null ) {
            pcmProfile.setJldspyj( dto.getJldspyj() );
        }
        if ( dto.getWbbm() != null ) {
            pcmProfile.setWbbm( dto.getWbbm() );
        }
        if ( dto.getSfxzbjnbry() != null ) {
            pcmProfile.setSfxzbjnbry( dto.getSfxzbjnbry() );
        }
        if ( dto.getEntrantdate() != null ) {
            pcmProfile.setEntrantdate( dto.getEntrantdate() );
        }
        if ( dto.getJzpspyj() != null ) {
            pcmProfile.setJzpspyj( dto.getJzpspyj() );
        }
        if ( dto.getYydjmc() != null ) {
            pcmProfile.setYydjmc( dto.getYydjmc() );
        }
        if ( dto.getBirthday() != null ) {
            pcmProfile.setBirthday( dto.getBirthday() );
        }
        if ( dto.getYydj() != null ) {
            pcmProfile.setYydj( dto.getYydj() );
        }
        if ( dto.getPolity() != null ) {
            pcmProfile.setPolity( dto.getPolity() );
        }
        if ( dto.getGzjssj() != null ) {
            pcmProfile.setGzjssj( dto.getGzjssj() );
        }
        if ( dto.getWedstate() != null ) {
            pcmProfile.setWedstate( dto.getWedstate() );
        }
        if ( dto.getCz4() != null ) {
            pcmProfile.setCz4( dto.getCz4() );
        }
        if ( dto.getRgjytg() != null ) {
            pcmProfile.setRgjytg( dto.getRgjytg() );
        }
        if ( dto.getXzc() != null ) {
            pcmProfile.setXzc( dto.getXzc() );
        }
        if ( dto.getHklx() != null ) {
            pcmProfile.setHklx( dto.getHklx() );
        }
        if ( dto.getQzsm() != null ) {
            pcmProfile.setQzsm( dto.getQzsm() );
        }
        if ( dto.getXznf() != null ) {
            pcmProfile.setXznf( dto.getXznf() );
        }
        if ( dto.getEducationstudymode() != null ) {
            pcmProfile.setEducationstudymode( dto.getEducationstudymode() );
        }
        if ( dto.getProfiletype() != null ) {
            pcmProfile.setProfiletype( dto.getProfiletype() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmProfile.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pcmProfile.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmpostid() != null ) {
            pcmProfile.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getOrmdutyid() != null ) {
            pcmProfile.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pcmProfile.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getCheckresult() != null ) {
            pcmProfile.setCheckresult( dto.getCheckresult() );
        }
        if ( dto.getCreateman() != null ) {
            pcmProfile.setCreateman( dto.getCreateman() );
        }
        if ( dto.getRlsbYpzzt() != null ) {
            pcmProfile.setRlsbYpzzt( dto.getRlsbYpzzt() );
        }
        if ( dto.getOrgid() != null ) {
            pcmProfile.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmProfile.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getZtcode() != null ) {
            pcmProfile.setZtcode( dto.getZtcode() );
        }
        if ( dto.getPcmprofileid() != null ) {
            pcmProfile.setPcmprofileid( dto.getPcmprofileid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmProfile.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getJspyjRlsb() != null ) {
            pcmProfile.setJspyjRlsb( dto.getJspyjRlsb() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmProfile.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmdutyname() != null ) {
            pcmProfile.setOrmdutyname( dto.getOrmdutyname() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pcmProfile.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getOrmorgname() != null ) {
            pcmProfile.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmProfile.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmpostname() != null ) {
            pcmProfile.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmProfile.setZzdzs( dto.getZzdzs() );
        }

        return pcmProfile;
    }

    @Override
    public PcmProfileDTO toDto(PcmProfile entity) {
        if ( entity == null ) {
            return null;
        }

        PcmProfileDTO pcmProfileDTO = new PcmProfileDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmProfileDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmProfileDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getGwlb() != null ) {
            pcmProfileDTO.setGwlb( entity.getGwlb() );
        }
        if ( entity.getRLastdiscipline() != null ) {
            pcmProfileDTO.setRLastdiscipline( entity.getRLastdiscipline() );
        }
        if ( entity.getRdsj() != null ) {
            pcmProfileDTO.setRdsj( entity.getRdsj() );
        }
        if ( entity.getWbzzjgdm() != null ) {
            pcmProfileDTO.setWbzzjgdm( entity.getWbzzjgdm() );
        }
        if ( entity.getBloodtype() != null ) {
            pcmProfileDTO.setBloodtype( entity.getBloodtype() );
        }
        if ( entity.getTjqk() != null ) {
            pcmProfileDTO.setTjqk( entity.getTjqk() );
        }
        if ( entity.getRSchoolis211() != null ) {
            pcmProfileDTO.setRSchoolis211( entity.getRSchoolis211() );
        }
        if ( entity.getSzyjtj() != null ) {
            pcmProfileDTO.setSzyjtj( entity.getSzyjtj() );
        }
        if ( entity.getApplicantid() != null ) {
            pcmProfileDTO.setApplicantid( entity.getApplicantid() );
        }
        if ( entity.getRSchoolis985() != null ) {
            pcmProfileDTO.setRSchoolis985( entity.getRSchoolis985() );
        }
        if ( entity.getYzbm() != null ) {
            pcmProfileDTO.setYzbm( entity.getYzbm() );
        }
        if ( entity.getResidencestate() != null ) {
            pcmProfileDTO.setResidencestate( entity.getResidencestate() );
        }
        if ( entity.getXkml() != null ) {
            pcmProfileDTO.setXkml( entity.getXkml() );
        }
        if ( entity.getJzpspyjyy() != null ) {
            pcmProfileDTO.setJzpspyjyy( entity.getJzpspyjyy() );
        }
        if ( entity.getBz() != null ) {
            pcmProfileDTO.setBz( entity.getBz() );
        }
        if ( entity.getCz2() != null ) {
            pcmProfileDTO.setCz2( entity.getCz2() );
        }
        if ( entity.getNf() != null ) {
            pcmProfileDTO.setNf( entity.getNf() );
        }
        if ( entity.getPhaseinfo() != null ) {
            pcmProfileDTO.setPhaseinfo( entity.getPhaseinfo() );
        }
        if ( entity.getGzkssj() != null ) {
            pcmProfileDTO.setGzkssj( entity.getGzkssj() );
        }
        if ( entity.getNqdldhtqx() != null ) {
            pcmProfileDTO.setNqdldhtqx( entity.getNqdldhtqx() );
        }
        if ( entity.getYglxshgz() != null ) {
            pcmProfileDTO.setYglxshgz( entity.getYglxshgz() );
        }
        if ( entity.getHighestdegree() != null ) {
            pcmProfileDTO.setHighestdegree( entity.getHighestdegree() );
        }
        if ( entity.getPcmprofilename() != null ) {
            pcmProfileDTO.setPcmprofilename( entity.getPcmprofilename() );
        }
        if ( entity.getRzqd() != null ) {
            pcmProfileDTO.setRzqd( entity.getRzqd() );
        }
        if ( entity.getCym() != null ) {
            pcmProfileDTO.setCym( entity.getCym() );
        }
        if ( entity.getRpr() != null ) {
            pcmProfileDTO.setRpr( entity.getRpr() );
        }
        if ( entity.getJzbspyjyy() != null ) {
            pcmProfileDTO.setJzbspyjyy( entity.getJzbspyjyy() );
        }
        if ( entity.getYglx() != null ) {
            pcmProfileDTO.setYglx( entity.getYglx() );
        }
        if ( entity.getYwzdjbs() != null ) {
            pcmProfileDTO.setYwzdjbs( entity.getYwzdjbs() );
        }
        if ( entity.getHobbies() != null ) {
            pcmProfileDTO.setHobbies( entity.getHobbies() );
        }
        if ( entity.getElinkurl() != null ) {
            pcmProfileDTO.setElinkurl( entity.getElinkurl() );
        }
        if ( entity.getMobile() != null ) {
            pcmProfileDTO.setMobile( entity.getMobile() );
        }
        if ( entity.getWbzw() != null ) {
            pcmProfileDTO.setWbzw( entity.getWbzw() );
        }
        if ( entity.getPersonnelfileplace() != null ) {
            pcmProfileDTO.setPersonnelfileplace( entity.getPersonnelfileplace() );
        }
        if ( entity.getZtyy() != null ) {
            pcmProfileDTO.setZtyy( entity.getZtyy() );
        }
        if ( entity.getZczs() != null ) {
            pcmProfileDTO.setZczs( entity.getZczs() );
        }
        if ( entity.getCz() != null ) {
            pcmProfileDTO.setCz( entity.getCz() );
        }
        if ( entity.getCadidateid() != null ) {
            pcmProfileDTO.setCadidateid( entity.getCadidateid() );
        }
        if ( entity.getIsblacklistreason() != null ) {
            pcmProfileDTO.setIsblacklistreason( entity.getIsblacklistreason() );
        }
        if ( entity.getQzfj() != null ) {
            pcmProfileDTO.setQzfj( entity.getQzfj() );
        }
        if ( entity.getEducationlevel() != null ) {
            pcmProfileDTO.setEducationlevel( entity.getEducationlevel() );
        }
        if ( entity.getDegreetype() != null ) {
            pcmProfileDTO.setDegreetype( entity.getDegreetype() );
        }
        if ( entity.getHjdz() != null ) {
            pcmProfileDTO.setHjdz( entity.getHjdz() );
        }
        if ( entity.getZplx() != null ) {
            pcmProfileDTO.setZplx( entity.getZplx() );
        }
        if ( entity.getYjsnf() != null ) {
            pcmProfileDTO.setYjsnf( entity.getYjsnf() );
        }
        if ( entity.getAddress() != null ) {
            pcmProfileDTO.setAddress( entity.getAddress() );
        }
        if ( entity.getSyqdqsj() != null ) {
            pcmProfileDTO.setSyqdqsj( entity.getSyqdqsj() );
        }
        if ( entity.getRLastschool() != null ) {
            pcmProfileDTO.setRLastschool( entity.getRLastschool() );
        }
        if ( entity.getRInitializeapplydate() != null ) {
            pcmProfileDTO.setRInitializeapplydate( entity.getRInitializeapplydate() );
        }
        if ( entity.getNativeplace() != null ) {
            pcmProfileDTO.setNativeplace( entity.getNativeplace() );
        }
        if ( entity.getCz5() != null ) {
            pcmProfileDTO.setCz5( entity.getCz5() );
        }
        if ( entity.getCertificatenumber() != null ) {
            pcmProfileDTO.setCertificatenumber( entity.getCertificatenumber() );
        }
        if ( entity.getJzbspyj() != null ) {
            pcmProfileDTO.setJzbspyj( entity.getJzbspyj() );
        }
        if ( entity.getGraduationdate() != null ) {
            pcmProfileDTO.setGraduationdate( entity.getGraduationdate() );
        }
        if ( entity.getSfz() != null ) {
            pcmProfileDTO.setSfz( entity.getSfz() );
        }
        if ( entity.getCertificatetype() != null ) {
            pcmProfileDTO.setCertificatetype( entity.getCertificatetype() );
        }
        if ( entity.getIsblacklist() != null ) {
            pcmProfileDTO.setIsblacklist( entity.getIsblacklist() );
        }
        if ( entity.getOtherfile() != null ) {
            pcmProfileDTO.setOtherfile( entity.getOtherfile() );
        }
        if ( entity.getNation() != null ) {
            pcmProfileDTO.setNation( entity.getNation() );
        }
        if ( entity.getEmail() != null ) {
            pcmProfileDTO.setEmail( entity.getEmail() );
        }
        if ( entity.getIsabroad() != null ) {
            pcmProfileDTO.setIsabroad( entity.getIsabroad() );
        }
        if ( entity.getYgbh() != null ) {
            pcmProfileDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getSftgcp() != null ) {
            pcmProfileDTO.setSftgcp( entity.getSftgcp() );
        }
        if ( entity.getJkzk() != null ) {
            pcmProfileDTO.setJkzk( entity.getJkzk() );
        }
        if ( entity.getCsd() != null ) {
            pcmProfileDTO.setCsd( entity.getCsd() );
        }
        if ( entity.getJldspyjyy() != null ) {
            pcmProfileDTO.setJldspyjyy( entity.getJldspyjyy() );
        }
        if ( entity.getPcmydgzmxid() != null ) {
            pcmProfileDTO.setPcmydgzmxid( entity.getPcmydgzmxid() );
        }
        if ( entity.getNl() != null ) {
            pcmProfileDTO.setNl( entity.getNl() );
        }
        if ( entity.getZp() != null ) {
            pcmProfileDTO.setZp( entity.getZp() );
        }
        if ( entity.getNapxmjgwmc() != null ) {
            pcmProfileDTO.setNapxmjgwmc( entity.getNapxmjgwmc() );
        }
        if ( entity.getSfxzy() != null ) {
            pcmProfileDTO.setSfxzy( entity.getSfxzy() );
        }
        if ( entity.getZczs2() != null ) {
            pcmProfileDTO.setZczs2( entity.getZczs2() );
        }
        if ( entity.getGender() != null ) {
            pcmProfileDTO.setGender( entity.getGender() );
        }
        if ( entity.getWorkbegindate() != null ) {
            pcmProfileDTO.setWorkbegindate( entity.getWorkbegindate() );
        }
        if ( entity.getWbgw() != null ) {
            pcmProfileDTO.setWbgw( entity.getWbgw() );
        }
        if ( entity.getWbzz() != null ) {
            pcmProfileDTO.setWbzz( entity.getWbzz() );
        }
        if ( entity.getRCertnames() != null ) {
            pcmProfileDTO.setRCertnames( entity.getRCertnames() );
        }
        if ( entity.getSbsj() != null ) {
            pcmProfileDTO.setSbsj( entity.getSbsj() );
        }
        if ( entity.getGzbt() != null ) {
            pcmProfileDTO.setGzbt( entity.getGzbt() );
        }
        if ( entity.getRtsj() != null ) {
            pcmProfileDTO.setRtsj( entity.getRtsj() );
        }
        if ( entity.getNapxm() != null ) {
            pcmProfileDTO.setNapxm( entity.getNapxm() );
        }
        if ( entity.getXxxz() != null ) {
            pcmProfileDTO.setXxxz( entity.getXxxz() );
        }
        if ( entity.getCz3() != null ) {
            pcmProfileDTO.setCz3( entity.getCz3() );
        }
        if ( entity.getJldspyj() != null ) {
            pcmProfileDTO.setJldspyj( entity.getJldspyj() );
        }
        if ( entity.getWbbm() != null ) {
            pcmProfileDTO.setWbbm( entity.getWbbm() );
        }
        if ( entity.getSfxzbjnbry() != null ) {
            pcmProfileDTO.setSfxzbjnbry( entity.getSfxzbjnbry() );
        }
        if ( entity.getEntrantdate() != null ) {
            pcmProfileDTO.setEntrantdate( entity.getEntrantdate() );
        }
        if ( entity.getJzpspyj() != null ) {
            pcmProfileDTO.setJzpspyj( entity.getJzpspyj() );
        }
        if ( entity.getYydjmc() != null ) {
            pcmProfileDTO.setYydjmc( entity.getYydjmc() );
        }
        if ( entity.getBirthday() != null ) {
            pcmProfileDTO.setBirthday( entity.getBirthday() );
        }
        if ( entity.getYydj() != null ) {
            pcmProfileDTO.setYydj( entity.getYydj() );
        }
        if ( entity.getPolity() != null ) {
            pcmProfileDTO.setPolity( entity.getPolity() );
        }
        if ( entity.getGzjssj() != null ) {
            pcmProfileDTO.setGzjssj( entity.getGzjssj() );
        }
        if ( entity.getWedstate() != null ) {
            pcmProfileDTO.setWedstate( entity.getWedstate() );
        }
        if ( entity.getCz4() != null ) {
            pcmProfileDTO.setCz4( entity.getCz4() );
        }
        if ( entity.getRgjytg() != null ) {
            pcmProfileDTO.setRgjytg( entity.getRgjytg() );
        }
        if ( entity.getXzc() != null ) {
            pcmProfileDTO.setXzc( entity.getXzc() );
        }
        if ( entity.getHklx() != null ) {
            pcmProfileDTO.setHklx( entity.getHklx() );
        }
        if ( entity.getQzsm() != null ) {
            pcmProfileDTO.setQzsm( entity.getQzsm() );
        }
        if ( entity.getXznf() != null ) {
            pcmProfileDTO.setXznf( entity.getXznf() );
        }
        if ( entity.getEducationstudymode() != null ) {
            pcmProfileDTO.setEducationstudymode( entity.getEducationstudymode() );
        }
        if ( entity.getProfiletype() != null ) {
            pcmProfileDTO.setProfiletype( entity.getProfiletype() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmProfileDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pcmProfileDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmpostid() != null ) {
            pcmProfileDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getOrmdutyid() != null ) {
            pcmProfileDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pcmProfileDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getCheckresult() != null ) {
            pcmProfileDTO.setCheckresult( entity.getCheckresult() );
        }
        if ( entity.getCreateman() != null ) {
            pcmProfileDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getRlsbYpzzt() != null ) {
            pcmProfileDTO.setRlsbYpzzt( entity.getRlsbYpzzt() );
        }
        if ( entity.getOrgid() != null ) {
            pcmProfileDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmProfileDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getZtcode() != null ) {
            pcmProfileDTO.setZtcode( entity.getZtcode() );
        }
        if ( entity.getPcmprofileid() != null ) {
            pcmProfileDTO.setPcmprofileid( entity.getPcmprofileid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmProfileDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getJspyjRlsb() != null ) {
            pcmProfileDTO.setJspyjRlsb( entity.getJspyjRlsb() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmProfileDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmdutyname() != null ) {
            pcmProfileDTO.setOrmdutyname( entity.getOrmdutyname() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pcmProfileDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getOrmorgname() != null ) {
            pcmProfileDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmProfileDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmpostname() != null ) {
            pcmProfileDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmProfileDTO.setZzdzs( entity.getZzdzs() );
        }

        return pcmProfileDTO;
    }

    @Override
    public List<PcmProfile> toDomain(List<PcmProfileDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmProfile> list = new ArrayList<PcmProfile>( dtoList.size() );
        for ( PcmProfileDTO pcmProfileDTO : dtoList ) {
            list.add( toDomain( pcmProfileDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmProfileDTO> toDto(List<PcmProfile> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmProfileDTO> list = new ArrayList<PcmProfileDTO>( entityList.size() );
        for ( PcmProfile pcmProfile : entityList ) {
            list.add( toDto( pcmProfile ) );
        }

        return list;
    }
}
