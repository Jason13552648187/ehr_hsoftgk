package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimArchives;
import cn.ibizlab.ehr.webapi.dto.PimArchivesDTO;
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
public class PimArchivesMappingImpl implements PimArchivesMapping {

    @Override
    public PimArchives toDomain(PimArchivesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimArchives pimArchives = new PimArchives();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimArchives.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimArchives.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getZt() != null ) {
            pimArchives.setZt( dto.getZt() );
        }
        if ( dto.getDalyd() != null ) {
            pimArchives.setDalyd( dto.getDalyd() );
        }
        if ( dto.getFileaudit() != null ) {
            pimArchives.setFileaudit( dto.getFileaudit() );
        }
        if ( dto.getEducation() != null ) {
            pimArchives.setEducation( dto.getEducation() );
        }
        if ( dto.getDcda() != null ) {
            pimArchives.setDcda( dto.getDcda() );
        }
        if ( dto.getOperationdate() != null ) {
            pimArchives.setOperationdate( dto.getOperationdate() );
        }
        if ( dto.getTranstoout() != null ) {
            pimArchives.setTranstoout( dto.getTranstoout() );
        }
        if ( dto.getPimarchivesname() != null ) {
            pimArchives.setPimarchivesname( dto.getPimarchivesname() );
        }
        if ( dto.getStartworkdatae() != null ) {
            pimArchives.setStartworkdatae( dto.getStartworkdatae() );
        }
        if ( dto.getSfxjd() != null ) {
            pimArchives.setSfxjd( dto.getSfxjd() );
        }
        if ( dto.getDabh() != null ) {
            pimArchives.setDabh( dto.getDabh() );
        }
        if ( dto.getBz() != null ) {
            pimArchives.setBz( dto.getBz() );
        }
        if ( dto.getCfgh() != null ) {
            pimArchives.setCfgh( dto.getCfgh() );
        }
        if ( dto.getDateofbirth() != null ) {
            pimArchives.setDateofbirth( dto.getDateofbirth() );
        }
        if ( dto.getDadrrq() != null ) {
            pimArchives.setDadrrq( dto.getDadrrq() );
        }
        if ( dto.getDazt() != null ) {
            pimArchives.setDazt( dto.getDazt() );
        }
        if ( dto.getDastate() != null ) {
            pimArchives.setDastate( dto.getDastate() );
        }
        if ( dto.getFj() != null ) {
            pimArchives.setFj( dto.getFj() );
        }
        if ( dto.getJoinpartydate() != null ) {
            pimArchives.setJoinpartydate( dto.getJoinpartydate() );
        }
        if ( dto.getOperations() != null ) {
            pimArchives.setOperations( dto.getOperations() );
        }
        if ( dto.getDabgd() != null ) {
            pimArchives.setDabgd( dto.getDabgd() );
        }
        if ( dto.getDamu() != null ) {
            pimArchives.setDamu( dto.getDamu() );
        }
        if ( dto.getDadcdw() != null ) {
            pimArchives.setDadcdw( dto.getDadcdw() );
        }
        if ( dto.getDuration() != null ) {
            pimArchives.setDuration( dto.getDuration() );
        }
        if ( dto.getDrda() != null ) {
            pimArchives.setDrda( dto.getDrda() );
        }
        if ( dto.getXdabgdw() != null ) {
            pimArchives.setXdabgdw( dto.getXdabgdw() );
        }
        if ( dto.getDabgdd() != null ) {
            pimArchives.setDabgdd( dto.getDabgdd() );
        }
        if ( dto.getOrmorgname2() != null ) {
            pimArchives.setOrmorgname2( dto.getOrmorgname2() );
        }
        if ( dto.getArchivescenterid() != null ) {
            pimArchives.setArchivescenterid( dto.getArchivescenterid() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimArchives.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmorgid2() != null ) {
            pimArchives.setOrmorgid2( dto.getOrmorgid2() );
        }
        if ( dto.getOrmorgid3() != null ) {
            pimArchives.setOrmorgid3( dto.getOrmorgid3() );
        }
        if ( dto.getPimarchivesid() != null ) {
            pimArchives.setPimarchivesid( dto.getPimarchivesid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimArchives.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrgid() != null ) {
            pimArchives.setOrgid( dto.getOrgid() );
        }
        if ( dto.getCreateman() != null ) {
            pimArchives.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            pimArchives.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            pimArchives.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pimArchives.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getArchivescentername() != null ) {
            pimArchives.setArchivescentername( dto.getArchivescentername() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimArchives.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getGlzzdzs() != null ) {
            pimArchives.setGlzzdzs( dto.getGlzzdzs() );
        }
        if ( dto.getDbdwsj() != null ) {
            pimArchives.setDbdwsj( dto.getDbdwsj() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimArchives.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getLeavedate() != null ) {
            pimArchives.setLeavedate( dto.getLeavedate() );
        }
        if ( dto.getSszzdzs() != null ) {
            pimArchives.setSszzdzs( dto.getSszzdzs() );
        }
        if ( dto.getOrgcode() != null ) {
            pimArchives.setOrgcode( dto.getOrgcode() );
        }
        if ( dto.getYgbh() != null ) {
            pimArchives.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmorgname3() != null ) {
            pimArchives.setOrmorgname3( dto.getOrmorgname3() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimArchives.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getZgcode() != null ) {
            pimArchives.setZgcode( dto.getZgcode() );
        }
        if ( dto.getYgzt() != null ) {
            pimArchives.setYgzt( dto.getYgzt() );
        }
        if ( dto.getZzdzs() != null ) {
            pimArchives.setZzdzs( dto.getZzdzs() );
        }

        return pimArchives;
    }

    @Override
    public PimArchivesDTO toDto(PimArchives entity) {
        if ( entity == null ) {
            return null;
        }

        PimArchivesDTO pimArchivesDTO = new PimArchivesDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimArchivesDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimArchivesDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getZt() != null ) {
            pimArchivesDTO.setZt( entity.getZt() );
        }
        if ( entity.getDalyd() != null ) {
            pimArchivesDTO.setDalyd( entity.getDalyd() );
        }
        if ( entity.getFileaudit() != null ) {
            pimArchivesDTO.setFileaudit( entity.getFileaudit() );
        }
        if ( entity.getEducation() != null ) {
            pimArchivesDTO.setEducation( entity.getEducation() );
        }
        if ( entity.getDcda() != null ) {
            pimArchivesDTO.setDcda( entity.getDcda() );
        }
        if ( entity.getOperationdate() != null ) {
            pimArchivesDTO.setOperationdate( entity.getOperationdate() );
        }
        if ( entity.getTranstoout() != null ) {
            pimArchivesDTO.setTranstoout( entity.getTranstoout() );
        }
        if ( entity.getPimarchivesname() != null ) {
            pimArchivesDTO.setPimarchivesname( entity.getPimarchivesname() );
        }
        if ( entity.getStartworkdatae() != null ) {
            pimArchivesDTO.setStartworkdatae( entity.getStartworkdatae() );
        }
        if ( entity.getSfxjd() != null ) {
            pimArchivesDTO.setSfxjd( entity.getSfxjd() );
        }
        if ( entity.getDabh() != null ) {
            pimArchivesDTO.setDabh( entity.getDabh() );
        }
        if ( entity.getBz() != null ) {
            pimArchivesDTO.setBz( entity.getBz() );
        }
        if ( entity.getCfgh() != null ) {
            pimArchivesDTO.setCfgh( entity.getCfgh() );
        }
        if ( entity.getDateofbirth() != null ) {
            pimArchivesDTO.setDateofbirth( entity.getDateofbirth() );
        }
        if ( entity.getDadrrq() != null ) {
            pimArchivesDTO.setDadrrq( entity.getDadrrq() );
        }
        if ( entity.getDazt() != null ) {
            pimArchivesDTO.setDazt( entity.getDazt() );
        }
        if ( entity.getDastate() != null ) {
            pimArchivesDTO.setDastate( entity.getDastate() );
        }
        if ( entity.getFj() != null ) {
            pimArchivesDTO.setFj( entity.getFj() );
        }
        if ( entity.getJoinpartydate() != null ) {
            pimArchivesDTO.setJoinpartydate( entity.getJoinpartydate() );
        }
        if ( entity.getOperations() != null ) {
            pimArchivesDTO.setOperations( entity.getOperations() );
        }
        if ( entity.getDabgd() != null ) {
            pimArchivesDTO.setDabgd( entity.getDabgd() );
        }
        if ( entity.getDamu() != null ) {
            pimArchivesDTO.setDamu( entity.getDamu() );
        }
        if ( entity.getDadcdw() != null ) {
            pimArchivesDTO.setDadcdw( entity.getDadcdw() );
        }
        if ( entity.getDuration() != null ) {
            pimArchivesDTO.setDuration( entity.getDuration() );
        }
        if ( entity.getDrda() != null ) {
            pimArchivesDTO.setDrda( entity.getDrda() );
        }
        if ( entity.getXdabgdw() != null ) {
            pimArchivesDTO.setXdabgdw( entity.getXdabgdw() );
        }
        if ( entity.getDabgdd() != null ) {
            pimArchivesDTO.setDabgdd( entity.getDabgdd() );
        }
        if ( entity.getOrmorgname2() != null ) {
            pimArchivesDTO.setOrmorgname2( entity.getOrmorgname2() );
        }
        if ( entity.getArchivescenterid() != null ) {
            pimArchivesDTO.setArchivescenterid( entity.getArchivescenterid() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimArchivesDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmorgid2() != null ) {
            pimArchivesDTO.setOrmorgid2( entity.getOrmorgid2() );
        }
        if ( entity.getOrmorgid3() != null ) {
            pimArchivesDTO.setOrmorgid3( entity.getOrmorgid3() );
        }
        if ( entity.getPimarchivesid() != null ) {
            pimArchivesDTO.setPimarchivesid( entity.getPimarchivesid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimArchivesDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrgid() != null ) {
            pimArchivesDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getCreateman() != null ) {
            pimArchivesDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            pimArchivesDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            pimArchivesDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pimArchivesDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getArchivescentername() != null ) {
            pimArchivesDTO.setArchivescentername( entity.getArchivescentername() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimArchivesDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getGlzzdzs() != null ) {
            pimArchivesDTO.setGlzzdzs( entity.getGlzzdzs() );
        }
        if ( entity.getDbdwsj() != null ) {
            pimArchivesDTO.setDbdwsj( entity.getDbdwsj() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimArchivesDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getLeavedate() != null ) {
            pimArchivesDTO.setLeavedate( entity.getLeavedate() );
        }
        if ( entity.getSszzdzs() != null ) {
            pimArchivesDTO.setSszzdzs( entity.getSszzdzs() );
        }
        if ( entity.getOrgcode() != null ) {
            pimArchivesDTO.setOrgcode( entity.getOrgcode() );
        }
        if ( entity.getYgbh() != null ) {
            pimArchivesDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmorgname3() != null ) {
            pimArchivesDTO.setOrmorgname3( entity.getOrmorgname3() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimArchivesDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getZgcode() != null ) {
            pimArchivesDTO.setZgcode( entity.getZgcode() );
        }
        if ( entity.getYgzt() != null ) {
            pimArchivesDTO.setYgzt( entity.getYgzt() );
        }
        if ( entity.getZzdzs() != null ) {
            pimArchivesDTO.setZzdzs( entity.getZzdzs() );
        }

        return pimArchivesDTO;
    }

    @Override
    public List<PimArchives> toDomain(List<PimArchivesDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimArchives> list = new ArrayList<PimArchives>( dtoList.size() );
        for ( PimArchivesDTO pimArchivesDTO : dtoList ) {
            list.add( toDomain( pimArchivesDTO ) );
        }

        return list;
    }

    @Override
    public List<PimArchivesDTO> toDto(List<PimArchives> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimArchivesDTO> list = new ArrayList<PimArchivesDTO>( entityList.size() );
        for ( PimArchives pimArchives : entityList ) {
            list.add( toDto( pimArchives ) );
        }

        return list;
    }
}
