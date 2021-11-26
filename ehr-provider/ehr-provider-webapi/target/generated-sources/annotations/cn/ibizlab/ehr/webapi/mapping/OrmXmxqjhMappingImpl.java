package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmXmxqjh;
import cn.ibizlab.ehr.webapi.dto.OrmXmxqjhDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmXmxqjhMappingImpl implements OrmXmxqjhMapping {

    @Override
    public OrmXmxqjh toDomain(OrmXmxqjhDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmXmxqjh ormXmxqjh = new OrmXmxqjh();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormXmxqjh.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormXmxqjh.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getOldid() != null ) {
            ormXmxqjh.setOldid( dto.getOldid() );
        }
        if ( dto.getJzmj() != null ) {
            ormXmxqjh.setJzmj( dto.getJzmj() );
        }
        if ( dto.getOrgshortname() != null ) {
            ormXmxqjh.setOrgshortname( dto.getOrgshortname() );
        }
        if ( dto.getGqap() != null ) {
            ormXmxqjh.setGqap( dto.getGqap() );
        }
        if ( dto.getXmgmms() != null ) {
            ormXmxqjh.setXmgmms( dto.getXmgmms() );
        }
        if ( dto.getApprovalstatus() != null ) {
            ormXmxqjh.setApprovalstatus( dto.getApprovalstatus() );
        }
        if ( dto.getOrgsecinfoid() != null ) {
            ormXmxqjh.setOrgsecinfoid( dto.getOrgsecinfoid() );
        }
        if ( dto.getReason() != null ) {
            ormXmxqjh.setReason( dto.getReason() );
        }
        if ( dto.getOrginfoid() != null ) {
            ormXmxqjh.setOrginfoid( dto.getOrginfoid() );
        }
        if ( dto.getOrgcode() != null ) {
            ormXmxqjh.setOrgcode( dto.getOrgcode() );
        }
        if ( dto.getGcmcjbm() != null ) {
            ormXmxqjh.setGcmcjbm( dto.getGcmcjbm() );
        }
        if ( dto.getZtsg() != null ) {
            ormXmxqjh.setZtsg( dto.getZtsg() );
        }
        if ( dto.getBbh() != null ) {
            ormXmxqjh.setBbh( dto.getBbh() );
        }
        if ( dto.getDxmzgyq() != null ) {
            ormXmxqjh.setDxmzgyq( dto.getDxmzgyq() );
        }
        if ( dto.getEdition() != null ) {
            ormXmxqjh.setEdition( dto.getEdition() );
        }
        if ( dto.getJhcb() != null ) {
            ormXmxqjh.setJhcb( dto.getJhcb() );
        }
        if ( dto.getOrginfoname() != null ) {
            ormXmxqjh.setOrginfoname( dto.getOrginfoname() );
        }
        if ( dto.getGczj() != null ) {
            ormXmxqjh.setGczj( dto.getGczj() );
        }
        if ( dto.getXmlx() != null ) {
            ormXmxqjh.setXmlx( dto.getXmlx() );
        }
        if ( dto.getZszx() != null ) {
            ormXmxqjh.setZszx( dto.getZszx() );
        }
        if ( dto.getOrmxmxqjhname() != null ) {
            ormXmxqjh.setOrmxmxqjhname( dto.getOrmxmxqjhname() );
        }
        if ( dto.getEditionstate() != null ) {
            ormXmxqjh.setEditionstate( dto.getEditionstate() );
        }
        if ( dto.getGcjs() != null ) {
            ormXmxqjh.setGcjs( dto.getGcjs() );
        }
        if ( dto.getGcsw() != null ) {
            ormXmxqjh.setGcsw( dto.getGcsw() );
        }
        if ( dto.getQtjd() != null ) {
            ormXmxqjh.setQtjd( dto.getQtjd() );
        }
        if ( dto.getXmblx() != null ) {
            ormXmxqjh.setXmblx( dto.getXmblx() );
        }
        if ( dto.getDxmjlyq() != null ) {
            ormXmxqjh.setDxmjlyq( dto.getDxmjlyq() );
        }
        if ( dto.getXmlxqt() != null ) {
            ormXmxqjh.setXmlxqt( dto.getXmlxqt() );
        }
        if ( dto.getXmbmc() != null ) {
            ormXmxqjh.setXmbmc( dto.getXmbmc() );
        }
        if ( dto.getSgjd() != null ) {
            ormXmxqjh.setSgjd( dto.getSgjd() );
        }
        if ( dto.getXmjbqk() != null ) {
            ormXmxqjh.setXmjbqk( dto.getXmjbqk() );
        }
        if ( dto.getXmbjc() != null ) {
            ormXmxqjh.setXmbjc( dto.getXmbjc() );
        }
        if ( dto.getPimpersonid() != null ) {
            ormXmxqjh.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmxmglid() != null ) {
            ormXmxqjh.setOrmxmglid( dto.getOrmxmglid() );
        }
        if ( dto.getOrgid() != null ) {
            ormXmxqjh.setOrgid( dto.getOrgid() );
        }
        if ( dto.getCreatedate() != null ) {
            ormXmxqjh.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            ormXmxqjh.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormXmxqjh.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            ormXmxqjh.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmxmxqjhid() != null ) {
            ormXmxqjh.setOrmxmxqjhid( dto.getOrmxmxqjhid() );
        }
        if ( dto.getOrdervalue() != null ) {
            ormXmxqjh.setOrdervalue( dto.getOrdervalue() );
        }
        if ( dto.getOrmxmglname() != null ) {
            ormXmxqjh.setOrmxmglname( dto.getOrmxmglname() );
        }
        if ( dto.getXmbh() != null ) {
            ormXmxqjh.setXmbh( dto.getXmbh() );
        }
        if ( dto.getPimpersonname() != null ) {
            ormXmxqjh.setPimpersonname( dto.getPimpersonname() );
        }

        return ormXmxqjh;
    }

    @Override
    public OrmXmxqjhDTO toDto(OrmXmxqjh entity) {
        if ( entity == null ) {
            return null;
        }

        OrmXmxqjhDTO ormXmxqjhDTO = new OrmXmxqjhDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormXmxqjhDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormXmxqjhDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getOldid() != null ) {
            ormXmxqjhDTO.setOldid( entity.getOldid() );
        }
        if ( entity.getJzmj() != null ) {
            ormXmxqjhDTO.setJzmj( entity.getJzmj() );
        }
        if ( entity.getOrgshortname() != null ) {
            ormXmxqjhDTO.setOrgshortname( entity.getOrgshortname() );
        }
        if ( entity.getGqap() != null ) {
            ormXmxqjhDTO.setGqap( entity.getGqap() );
        }
        if ( entity.getXmgmms() != null ) {
            ormXmxqjhDTO.setXmgmms( entity.getXmgmms() );
        }
        if ( entity.getApprovalstatus() != null ) {
            ormXmxqjhDTO.setApprovalstatus( entity.getApprovalstatus() );
        }
        if ( entity.getOrgsecinfoid() != null ) {
            ormXmxqjhDTO.setOrgsecinfoid( entity.getOrgsecinfoid() );
        }
        if ( entity.getReason() != null ) {
            ormXmxqjhDTO.setReason( entity.getReason() );
        }
        if ( entity.getOrginfoid() != null ) {
            ormXmxqjhDTO.setOrginfoid( entity.getOrginfoid() );
        }
        if ( entity.getOrgcode() != null ) {
            ormXmxqjhDTO.setOrgcode( entity.getOrgcode() );
        }
        if ( entity.getGcmcjbm() != null ) {
            ormXmxqjhDTO.setGcmcjbm( entity.getGcmcjbm() );
        }
        if ( entity.getZtsg() != null ) {
            ormXmxqjhDTO.setZtsg( entity.getZtsg() );
        }
        if ( entity.getBbh() != null ) {
            ormXmxqjhDTO.setBbh( entity.getBbh() );
        }
        if ( entity.getDxmzgyq() != null ) {
            ormXmxqjhDTO.setDxmzgyq( entity.getDxmzgyq() );
        }
        if ( entity.getEdition() != null ) {
            ormXmxqjhDTO.setEdition( entity.getEdition() );
        }
        if ( entity.getJhcb() != null ) {
            ormXmxqjhDTO.setJhcb( entity.getJhcb() );
        }
        if ( entity.getOrginfoname() != null ) {
            ormXmxqjhDTO.setOrginfoname( entity.getOrginfoname() );
        }
        if ( entity.getGczj() != null ) {
            ormXmxqjhDTO.setGczj( entity.getGczj() );
        }
        if ( entity.getXmlx() != null ) {
            ormXmxqjhDTO.setXmlx( entity.getXmlx() );
        }
        if ( entity.getZszx() != null ) {
            ormXmxqjhDTO.setZszx( entity.getZszx() );
        }
        if ( entity.getOrmxmxqjhname() != null ) {
            ormXmxqjhDTO.setOrmxmxqjhname( entity.getOrmxmxqjhname() );
        }
        if ( entity.getEditionstate() != null ) {
            ormXmxqjhDTO.setEditionstate( entity.getEditionstate() );
        }
        if ( entity.getGcjs() != null ) {
            ormXmxqjhDTO.setGcjs( entity.getGcjs() );
        }
        if ( entity.getGcsw() != null ) {
            ormXmxqjhDTO.setGcsw( entity.getGcsw() );
        }
        if ( entity.getQtjd() != null ) {
            ormXmxqjhDTO.setQtjd( entity.getQtjd() );
        }
        if ( entity.getXmblx() != null ) {
            ormXmxqjhDTO.setXmblx( entity.getXmblx() );
        }
        if ( entity.getDxmjlyq() != null ) {
            ormXmxqjhDTO.setDxmjlyq( entity.getDxmjlyq() );
        }
        if ( entity.getXmlxqt() != null ) {
            ormXmxqjhDTO.setXmlxqt( entity.getXmlxqt() );
        }
        if ( entity.getXmbmc() != null ) {
            ormXmxqjhDTO.setXmbmc( entity.getXmbmc() );
        }
        if ( entity.getSgjd() != null ) {
            ormXmxqjhDTO.setSgjd( entity.getSgjd() );
        }
        if ( entity.getXmjbqk() != null ) {
            ormXmxqjhDTO.setXmjbqk( entity.getXmjbqk() );
        }
        if ( entity.getXmbjc() != null ) {
            ormXmxqjhDTO.setXmbjc( entity.getXmbjc() );
        }
        if ( entity.getPimpersonid() != null ) {
            ormXmxqjhDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmxmglid() != null ) {
            ormXmxqjhDTO.setOrmxmglid( entity.getOrmxmglid() );
        }
        if ( entity.getOrgid() != null ) {
            ormXmxqjhDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getCreatedate() != null ) {
            ormXmxqjhDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            ormXmxqjhDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormXmxqjhDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            ormXmxqjhDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmxmxqjhid() != null ) {
            ormXmxqjhDTO.setOrmxmxqjhid( entity.getOrmxmxqjhid() );
        }
        if ( entity.getOrdervalue() != null ) {
            ormXmxqjhDTO.setOrdervalue( entity.getOrdervalue() );
        }
        if ( entity.getOrmxmglname() != null ) {
            ormXmxqjhDTO.setOrmxmglname( entity.getOrmxmglname() );
        }
        if ( entity.getXmbh() != null ) {
            ormXmxqjhDTO.setXmbh( entity.getXmbh() );
        }
        if ( entity.getPimpersonname() != null ) {
            ormXmxqjhDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return ormXmxqjhDTO;
    }

    @Override
    public List<OrmXmxqjh> toDomain(List<OrmXmxqjhDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmXmxqjh> list = new ArrayList<OrmXmxqjh>( dtoList.size() );
        for ( OrmXmxqjhDTO ormXmxqjhDTO : dtoList ) {
            list.add( toDomain( ormXmxqjhDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmXmxqjhDTO> toDto(List<OrmXmxqjh> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmXmxqjhDTO> list = new ArrayList<OrmXmxqjhDTO>( entityList.size() );
        for ( OrmXmxqjh ormXmxqjh : entityList ) {
            list.add( toDto( ormXmxqjh ) );
        }

        return list;
    }
}
