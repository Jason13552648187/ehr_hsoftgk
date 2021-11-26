package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmOrg;
import cn.ibizlab.ehr.webapi.dto.OrmOrgDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmOrgMappingImpl implements OrmOrgMapping {

    @Override
    public OrmOrg toDomain(OrmOrgDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmOrg ormOrg = new OrmOrg();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormOrg.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormOrg.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getBtqy() != null ) {
            ormOrg.setBtqy( dto.getBtqy() );
        }
        if ( dto.getStartstopsign() != null ) {
            ormOrg.setStartstopsign( dto.getStartstopsign() );
        }
        if ( dto.getCompanyflag() != null ) {
            ormOrg.setCompanyflag( dto.getCompanyflag() );
        }
        if ( dto.getLegalentity() != null ) {
            ormOrg.setLegalentity( dto.getLegalentity() );
        }
        if ( dto.getSsou() != null ) {
            ormOrg.setSsou( dto.getSsou() );
        }
        if ( dto.getZzdzbm() != null ) {
            ormOrg.setZzdzbm( dto.getZzdzbm() );
        }
        if ( dto.getGsss() != null ) {
            ormOrg.setGsss( dto.getGsss() );
        }
        if ( dto.getLevelcode() != null ) {
            ormOrg.setLevelcode( dto.getLevelcode() );
        }
        if ( dto.getPx() != null ) {
            ormOrg.setPx( dto.getPx() );
        }
        if ( dto.getZzcjsj() != null ) {
            ormOrg.setZzcjsj( dto.getZzcjsj() );
        }
        if ( dto.getZzdzy() != null ) {
            ormOrg.setZzdzy( dto.getZzdzy() );
        }
        if ( dto.getCorrespondingorg() != null ) {
            ormOrg.setCorrespondingorg( dto.getCorrespondingorg() );
        }
        if ( dto.getXn() != null ) {
            ormOrg.setXn( dto.getXn() );
        }
        if ( dto.getZzdze() != null ) {
            ormOrg.setZzdze( dto.getZzdze() );
        }
        if ( dto.getOrgcode() != null ) {
            ormOrg.setOrgcode( dto.getOrgcode() );
        }
        if ( dto.getZzdzs() != null ) {
            ormOrg.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getShortname() != null ) {
            ormOrg.setShortname( dto.getShortname() );
        }
        if ( dto.getErporgid() != null ) {
            ormOrg.setErporgid( dto.getErporgid() );
        }
        if ( dto.getZzlx() != null ) {
            ormOrg.setZzlx( dto.getZzlx() );
        }
        if ( dto.getPorgid() != null ) {
            ormOrg.setPorgid( dto.getPorgid() );
        }
        if ( dto.getCreatedate() != null ) {
            ormOrg.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            ormOrg.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormOrg.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            ormOrg.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrgid() != null ) {
            ormOrg.setOrgid( dto.getOrgid() );
        }
        if ( dto.getOrgname() != null ) {
            ormOrg.setOrgname( dto.getOrgname() );
        }
        if ( dto.getPorgname() != null ) {
            ormOrg.setPorgname( dto.getPorgname() );
        }

        return ormOrg;
    }

    @Override
    public OrmOrgDTO toDto(OrmOrg entity) {
        if ( entity == null ) {
            return null;
        }

        OrmOrgDTO ormOrgDTO = new OrmOrgDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormOrgDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormOrgDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getBtqy() != null ) {
            ormOrgDTO.setBtqy( entity.getBtqy() );
        }
        if ( entity.getStartstopsign() != null ) {
            ormOrgDTO.setStartstopsign( entity.getStartstopsign() );
        }
        if ( entity.getCompanyflag() != null ) {
            ormOrgDTO.setCompanyflag( entity.getCompanyflag() );
        }
        if ( entity.getLegalentity() != null ) {
            ormOrgDTO.setLegalentity( entity.getLegalentity() );
        }
        if ( entity.getSsou() != null ) {
            ormOrgDTO.setSsou( entity.getSsou() );
        }
        if ( entity.getZzdzbm() != null ) {
            ormOrgDTO.setZzdzbm( entity.getZzdzbm() );
        }
        if ( entity.getGsss() != null ) {
            ormOrgDTO.setGsss( entity.getGsss() );
        }
        if ( entity.getLevelcode() != null ) {
            ormOrgDTO.setLevelcode( entity.getLevelcode() );
        }
        if ( entity.getPx() != null ) {
            ormOrgDTO.setPx( entity.getPx() );
        }
        if ( entity.getZzcjsj() != null ) {
            ormOrgDTO.setZzcjsj( entity.getZzcjsj() );
        }
        if ( entity.getZzdzy() != null ) {
            ormOrgDTO.setZzdzy( entity.getZzdzy() );
        }
        if ( entity.getCorrespondingorg() != null ) {
            ormOrgDTO.setCorrespondingorg( entity.getCorrespondingorg() );
        }
        if ( entity.getXn() != null ) {
            ormOrgDTO.setXn( entity.getXn() );
        }
        if ( entity.getZzdze() != null ) {
            ormOrgDTO.setZzdze( entity.getZzdze() );
        }
        if ( entity.getOrgcode() != null ) {
            ormOrgDTO.setOrgcode( entity.getOrgcode() );
        }
        if ( entity.getZzdzs() != null ) {
            ormOrgDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getShortname() != null ) {
            ormOrgDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getErporgid() != null ) {
            ormOrgDTO.setErporgid( entity.getErporgid() );
        }
        if ( entity.getZzlx() != null ) {
            ormOrgDTO.setZzlx( entity.getZzlx() );
        }
        if ( entity.getPorgid() != null ) {
            ormOrgDTO.setPorgid( entity.getPorgid() );
        }
        if ( entity.getCreatedate() != null ) {
            ormOrgDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            ormOrgDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormOrgDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            ormOrgDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrgid() != null ) {
            ormOrgDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getOrgname() != null ) {
            ormOrgDTO.setOrgname( entity.getOrgname() );
        }
        if ( entity.getPorgname() != null ) {
            ormOrgDTO.setPorgname( entity.getPorgname() );
        }

        return ormOrgDTO;
    }

    @Override
    public List<OrmOrg> toDomain(List<OrmOrgDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmOrg> list = new ArrayList<OrmOrg>( dtoList.size() );
        for ( OrmOrgDTO ormOrgDTO : dtoList ) {
            list.add( toDomain( ormOrgDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmOrgDTO> toDto(List<OrmOrg> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmOrgDTO> list = new ArrayList<OrmOrgDTO>( entityList.size() );
        for ( OrmOrg ormOrg : entityList ) {
            list.add( toDto( ormOrg ) );
        }

        return list;
    }
}
