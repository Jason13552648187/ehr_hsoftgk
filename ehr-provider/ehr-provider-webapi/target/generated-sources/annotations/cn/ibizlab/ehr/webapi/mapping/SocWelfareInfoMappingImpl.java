package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.soc.domain.SocWelfareInfo;
import cn.ibizlab.ehr.webapi.dto.SocWelfareInfoDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SocWelfareInfoMappingImpl implements SocWelfareInfoMapping {

    @Override
    public SocWelfareInfo toDomain(SocWelfareInfoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SocWelfareInfo socWelfareInfo = new SocWelfareInfo();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            socWelfareInfo.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            socWelfareInfo.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSxsj2() != null ) {
            socWelfareInfo.setSxsj2( dto.getSxsj2() );
        }
        if ( dto.getGrgjjzh() != null ) {
            socWelfareInfo.setGrgjjzh( dto.getGrgjjzh() );
        }
        if ( dto.getGrsbzh() != null ) {
            socWelfareInfo.setGrsbzh( dto.getGrsbzh() );
        }
        if ( dto.getSocwelfareinfoname() != null ) {
            socWelfareInfo.setSocwelfareinfoname( dto.getSocwelfareinfoname() );
        }
        if ( dto.getSxsj() != null ) {
            socWelfareInfo.setSxsj( dto.getSxsj() );
        }
        if ( dto.getPimpersonid() != null ) {
            socWelfareInfo.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getSoccompanywelid() != null ) {
            socWelfareInfo.setSoccompanywelid( dto.getSoccompanywelid() );
        }
        if ( dto.getOrgid() != null ) {
            socWelfareInfo.setOrgid( dto.getOrgid() );
        }
        if ( dto.getEnable() != null ) {
            socWelfareInfo.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            socWelfareInfo.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            socWelfareInfo.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrgsectorid() != null ) {
            socWelfareInfo.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getCreatedate() != null ) {
            socWelfareInfo.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getSocwelfareinfoid() != null ) {
            socWelfareInfo.setSocwelfareinfoid( dto.getSocwelfareinfoid() );
        }
        if ( dto.getUpdateman() != null ) {
            socWelfareInfo.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmorgname() != null ) {
            socWelfareInfo.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getSocselfarebasename() != null ) {
            socWelfareInfo.setSocselfarebasename( dto.getSocselfarebasename() );
        }
        if ( dto.getOrmorgid() != null ) {
            socWelfareInfo.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getZjhm() != null ) {
            socWelfareInfo.setZjhm( dto.getZjhm() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            socWelfareInfo.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getYgbh() != null ) {
            socWelfareInfo.setYgbh( dto.getYgbh() );
        }
        if ( dto.getPimpersonname() != null ) {
            socWelfareInfo.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getSoccompanywelname() != null ) {
            socWelfareInfo.setSoccompanywelname( dto.getSoccompanywelname() );
        }

        return socWelfareInfo;
    }

    @Override
    public SocWelfareInfoDTO toDto(SocWelfareInfo entity) {
        if ( entity == null ) {
            return null;
        }

        SocWelfareInfoDTO socWelfareInfoDTO = new SocWelfareInfoDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            socWelfareInfoDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            socWelfareInfoDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSxsj2() != null ) {
            socWelfareInfoDTO.setSxsj2( entity.getSxsj2() );
        }
        if ( entity.getGrgjjzh() != null ) {
            socWelfareInfoDTO.setGrgjjzh( entity.getGrgjjzh() );
        }
        if ( entity.getGrsbzh() != null ) {
            socWelfareInfoDTO.setGrsbzh( entity.getGrsbzh() );
        }
        if ( entity.getSocwelfareinfoname() != null ) {
            socWelfareInfoDTO.setSocwelfareinfoname( entity.getSocwelfareinfoname() );
        }
        if ( entity.getSxsj() != null ) {
            socWelfareInfoDTO.setSxsj( entity.getSxsj() );
        }
        if ( entity.getPimpersonid() != null ) {
            socWelfareInfoDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getSoccompanywelid() != null ) {
            socWelfareInfoDTO.setSoccompanywelid( entity.getSoccompanywelid() );
        }
        if ( entity.getOrgid() != null ) {
            socWelfareInfoDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getEnable() != null ) {
            socWelfareInfoDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            socWelfareInfoDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            socWelfareInfoDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrgsectorid() != null ) {
            socWelfareInfoDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getCreatedate() != null ) {
            socWelfareInfoDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getSocwelfareinfoid() != null ) {
            socWelfareInfoDTO.setSocwelfareinfoid( entity.getSocwelfareinfoid() );
        }
        if ( entity.getUpdateman() != null ) {
            socWelfareInfoDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmorgname() != null ) {
            socWelfareInfoDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getSocselfarebasename() != null ) {
            socWelfareInfoDTO.setSocselfarebasename( entity.getSocselfarebasename() );
        }
        if ( entity.getOrmorgid() != null ) {
            socWelfareInfoDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getZjhm() != null ) {
            socWelfareInfoDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            socWelfareInfoDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getYgbh() != null ) {
            socWelfareInfoDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getPimpersonname() != null ) {
            socWelfareInfoDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getSoccompanywelname() != null ) {
            socWelfareInfoDTO.setSoccompanywelname( entity.getSoccompanywelname() );
        }

        return socWelfareInfoDTO;
    }

    @Override
    public List<SocWelfareInfo> toDomain(List<SocWelfareInfoDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SocWelfareInfo> list = new ArrayList<SocWelfareInfo>( dtoList.size() );
        for ( SocWelfareInfoDTO socWelfareInfoDTO : dtoList ) {
            list.add( toDomain( socWelfareInfoDTO ) );
        }

        return list;
    }

    @Override
    public List<SocWelfareInfoDTO> toDto(List<SocWelfareInfo> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SocWelfareInfoDTO> list = new ArrayList<SocWelfareInfoDTO>( entityList.size() );
        for ( SocWelfareInfo socWelfareInfo : entityList ) {
            list.add( toDto( socWelfareInfo ) );
        }

        return list;
    }
}
