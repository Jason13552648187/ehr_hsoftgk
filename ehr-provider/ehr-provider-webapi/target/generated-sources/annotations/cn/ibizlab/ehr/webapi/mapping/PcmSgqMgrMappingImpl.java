package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmSgqMgr;
import cn.ibizlab.ehr.webapi.dto.PcmSgqMgrDTO;
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
public class PcmSgqMgrMappingImpl implements PcmSgqMgrMapping {

    @Override
    public PcmSgqMgr toDomain(PcmSgqMgrDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmSgqMgr pcmSgqMgr = new PcmSgqMgr();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmSgqMgr.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmSgqMgr.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getKssj() != null ) {
            pcmSgqMgr.setKssj( dto.getKssj() );
        }
        if ( dto.getJssj() != null ) {
            pcmSgqMgr.setJssj( dto.getJssj() );
        }
        if ( dto.getSftgsh() != null ) {
            pcmSgqMgr.setSftgsh( dto.getSftgsh() );
        }
        if ( dto.getBz() != null ) {
            pcmSgqMgr.setBz( dto.getBz() );
        }
        if ( dto.getSgzt() != null ) {
            pcmSgqMgr.setSgzt( dto.getSgzt() );
        }
        if ( dto.getPcmsgqmgrname() != null ) {
            pcmSgqMgr.setPcmsgqmgrname( dto.getPcmsgqmgrname() );
        }
        if ( dto.getYgbh() != null ) {
            pcmSgqMgr.setYgbh( dto.getYgbh() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmSgqMgr.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPcmbdsqdmxid() != null ) {
            pcmSgqMgr.setPcmbdsqdmxid( dto.getPcmbdsqdmxid() );
        }
        if ( dto.getJssjColor() != null ) {
            pcmSgqMgr.setJssjColor( dto.getJssjColor() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmSgqMgr.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmSgqMgr.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPcmsgqmgrid() != null ) {
            pcmSgqMgr.setPcmsgqmgrid( dto.getPcmsgqmgrid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmSgqMgr.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmSgqMgr.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmSgqMgr.setPimpersonname( dto.getPimpersonname() );
        }

        return pcmSgqMgr;
    }

    @Override
    public PcmSgqMgrDTO toDto(PcmSgqMgr entity) {
        if ( entity == null ) {
            return null;
        }

        PcmSgqMgrDTO pcmSgqMgrDTO = new PcmSgqMgrDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmSgqMgrDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmSgqMgrDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getKssj() != null ) {
            pcmSgqMgrDTO.setKssj( entity.getKssj() );
        }
        if ( entity.getJssj() != null ) {
            pcmSgqMgrDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getSftgsh() != null ) {
            pcmSgqMgrDTO.setSftgsh( entity.getSftgsh() );
        }
        if ( entity.getBz() != null ) {
            pcmSgqMgrDTO.setBz( entity.getBz() );
        }
        if ( entity.getSgzt() != null ) {
            pcmSgqMgrDTO.setSgzt( entity.getSgzt() );
        }
        if ( entity.getPcmsgqmgrname() != null ) {
            pcmSgqMgrDTO.setPcmsgqmgrname( entity.getPcmsgqmgrname() );
        }
        if ( entity.getYgbh() != null ) {
            pcmSgqMgrDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmSgqMgrDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPcmbdsqdmxid() != null ) {
            pcmSgqMgrDTO.setPcmbdsqdmxid( entity.getPcmbdsqdmxid() );
        }
        if ( entity.getJssjColor() != null ) {
            pcmSgqMgrDTO.setJssjColor( entity.getJssjColor() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmSgqMgrDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmSgqMgrDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPcmsgqmgrid() != null ) {
            pcmSgqMgrDTO.setPcmsgqmgrid( entity.getPcmsgqmgrid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmSgqMgrDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmSgqMgrDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmSgqMgrDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return pcmSgqMgrDTO;
    }

    @Override
    public List<PcmSgqMgr> toDomain(List<PcmSgqMgrDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmSgqMgr> list = new ArrayList<PcmSgqMgr>( dtoList.size() );
        for ( PcmSgqMgrDTO pcmSgqMgrDTO : dtoList ) {
            list.add( toDomain( pcmSgqMgrDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmSgqMgrDTO> toDto(List<PcmSgqMgr> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmSgqMgrDTO> list = new ArrayList<PcmSgqMgrDTO>( entityList.size() );
        for ( PcmSgqMgr pcmSgqMgr : entityList ) {
            list.add( toDto( pcmSgqMgr ) );
        }

        return list;
    }
}
