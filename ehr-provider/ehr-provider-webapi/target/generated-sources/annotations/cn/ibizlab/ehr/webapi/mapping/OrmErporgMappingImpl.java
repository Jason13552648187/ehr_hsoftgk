package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmErporg;
import cn.ibizlab.ehr.webapi.dto.OrmErporgDTO;
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
public class OrmErporgMappingImpl implements OrmErporgMapping {

    @Override
    public OrmErporg toDomain(OrmErporgDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmErporg ormErporg = new OrmErporg();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormErporg.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormErporg.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getOrgtype() != null ) {
            ormErporg.setOrgtype( dto.getOrgtype() );
        }
        if ( dto.getTowncity() != null ) {
            ormErporg.setTowncity( dto.getTowncity() );
        }
        if ( dto.getIsenable() != null ) {
            ormErporg.setIsenable( dto.getIsenable() );
        }
        if ( dto.getDateto() != null ) {
            ormErporg.setDateto( dto.getDateto() );
        }
        if ( dto.getOrgaddressline1() != null ) {
            ormErporg.setOrgaddressline1( dto.getOrgaddressline1() );
        }
        if ( dto.getOrgtypename() != null ) {
            ormErporg.setOrgtypename( dto.getOrgtypename() );
        }
        if ( dto.getOrgaddressline3() != null ) {
            ormErporg.setOrgaddressline3( dto.getOrgaddressline3() );
        }
        if ( dto.getOrgaddressline2() != null ) {
            ormErporg.setOrgaddressline2( dto.getOrgaddressline2() );
        }
        if ( dto.getOucode() != null ) {
            ormErporg.setOucode( dto.getOucode() );
        }
        if ( dto.getLastupdatedate() != null ) {
            ormErporg.setLastupdatedate( dto.getLastupdatedate() );
        }
        if ( dto.getDatefrom() != null ) {
            ormErporg.setDatefrom( dto.getDatefrom() );
        }
        if ( dto.getYyflag() != null ) {
            ormErporg.setYyflag( dto.getYyflag() );
        }
        if ( dto.getOrgshortname() != null ) {
            ormErporg.setOrgshortname( dto.getOrgshortname() );
        }
        if ( dto.getOrmerporgname() != null ) {
            ormErporg.setOrmerporgname( dto.getOrmerporgname() );
        }
        if ( dto.getOrgcreatedate() != null ) {
            ormErporg.setOrgcreatedate( dto.getOrgcreatedate() );
        }
        if ( dto.getParentorgid() != null ) {
            ormErporg.setParentorgid( dto.getParentorgid() );
        }
        if ( dto.getOrdernum() != null ) {
            ormErporg.setOrdernum( dto.getOrdernum() );
        }
        if ( dto.getOrgzipcode() != null ) {
            ormErporg.setOrgzipcode( dto.getOrgzipcode() );
        }
        if ( dto.getOuid() != null ) {
            ormErporg.setOuid( dto.getOuid() );
        }
        if ( dto.getNumcomp() != null ) {
            ormErporg.setNumcomp( dto.getNumcomp() );
        }
        if ( dto.getOrgcode() != null ) {
            ormErporg.setOrgcode( dto.getOrgcode() );
        }
        if ( dto.getUpdateman() != null ) {
            ormErporg.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            ormErporg.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            ormErporg.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmerporgid() != null ) {
            ormErporg.setOrmerporgid( dto.getOrmerporgid() );
        }
        if ( dto.getBelongou() != null ) {
            ormErporg.setBelongou( dto.getBelongou() );
        }
        if ( dto.getAdmcoding() != null ) {
            ormErporg.setAdmcoding( dto.getAdmcoding() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormErporg.setUpdatedate( dto.getUpdatedate() );
        }

        return ormErporg;
    }

    @Override
    public OrmErporgDTO toDto(OrmErporg entity) {
        if ( entity == null ) {
            return null;
        }

        OrmErporgDTO ormErporgDTO = new OrmErporgDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormErporgDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormErporgDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getOrgtype() != null ) {
            ormErporgDTO.setOrgtype( entity.getOrgtype() );
        }
        if ( entity.getTowncity() != null ) {
            ormErporgDTO.setTowncity( entity.getTowncity() );
        }
        if ( entity.getIsenable() != null ) {
            ormErporgDTO.setIsenable( entity.getIsenable() );
        }
        if ( entity.getDateto() != null ) {
            ormErporgDTO.setDateto( entity.getDateto() );
        }
        if ( entity.getOrgaddressline1() != null ) {
            ormErporgDTO.setOrgaddressline1( entity.getOrgaddressline1() );
        }
        if ( entity.getOrgtypename() != null ) {
            ormErporgDTO.setOrgtypename( entity.getOrgtypename() );
        }
        if ( entity.getOrgaddressline3() != null ) {
            ormErporgDTO.setOrgaddressline3( entity.getOrgaddressline3() );
        }
        if ( entity.getOrgaddressline2() != null ) {
            ormErporgDTO.setOrgaddressline2( entity.getOrgaddressline2() );
        }
        if ( entity.getOucode() != null ) {
            ormErporgDTO.setOucode( entity.getOucode() );
        }
        if ( entity.getLastupdatedate() != null ) {
            ormErporgDTO.setLastupdatedate( entity.getLastupdatedate() );
        }
        if ( entity.getDatefrom() != null ) {
            ormErporgDTO.setDatefrom( entity.getDatefrom() );
        }
        if ( entity.getYyflag() != null ) {
            ormErporgDTO.setYyflag( entity.getYyflag() );
        }
        if ( entity.getOrgshortname() != null ) {
            ormErporgDTO.setOrgshortname( entity.getOrgshortname() );
        }
        if ( entity.getOrmerporgname() != null ) {
            ormErporgDTO.setOrmerporgname( entity.getOrmerporgname() );
        }
        if ( entity.getOrgcreatedate() != null ) {
            ormErporgDTO.setOrgcreatedate( entity.getOrgcreatedate() );
        }
        if ( entity.getParentorgid() != null ) {
            ormErporgDTO.setParentorgid( entity.getParentorgid() );
        }
        if ( entity.getOrdernum() != null ) {
            ormErporgDTO.setOrdernum( entity.getOrdernum() );
        }
        if ( entity.getOrgzipcode() != null ) {
            ormErporgDTO.setOrgzipcode( entity.getOrgzipcode() );
        }
        if ( entity.getOuid() != null ) {
            ormErporgDTO.setOuid( entity.getOuid() );
        }
        if ( entity.getNumcomp() != null ) {
            ormErporgDTO.setNumcomp( entity.getNumcomp() );
        }
        if ( entity.getOrgcode() != null ) {
            ormErporgDTO.setOrgcode( entity.getOrgcode() );
        }
        if ( entity.getUpdateman() != null ) {
            ormErporgDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            ormErporgDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            ormErporgDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmerporgid() != null ) {
            ormErporgDTO.setOrmerporgid( entity.getOrmerporgid() );
        }
        if ( entity.getBelongou() != null ) {
            ormErporgDTO.setBelongou( entity.getBelongou() );
        }
        if ( entity.getAdmcoding() != null ) {
            ormErporgDTO.setAdmcoding( entity.getAdmcoding() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormErporgDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return ormErporgDTO;
    }

    @Override
    public List<OrmErporg> toDomain(List<OrmErporgDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmErporg> list = new ArrayList<OrmErporg>( dtoList.size() );
        for ( OrmErporgDTO ormErporgDTO : dtoList ) {
            list.add( toDomain( ormErporgDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmErporgDTO> toDto(List<OrmErporg> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmErporgDTO> list = new ArrayList<OrmErporgDTO>( entityList.size() );
        for ( OrmErporg ormErporg : entityList ) {
            list.add( toDto( ormErporg ) );
        }

        return list;
    }
}
