package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmTxfpsq;
import cn.ibizlab.ehr.webapi.dto.PcmTxfpsqDTO;
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
    date = "2021-09-04T00:31:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmTxfpsqMappingImpl implements PcmTxfpsqMapping {

    @Override
    public PcmTxfpsq toDomain(PcmTxfpsqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmTxfpsq pcmTxfpsq = new PcmTxfpsq();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmTxfpsq.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmTxfpsq.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getFinished() != null ) {
            pcmTxfpsq.setFinished( dto.getFinished() );
        }
        if ( dto.getCzrid() != null ) {
            pcmTxfpsq.setCzrid( dto.getCzrid() );
        }
        if ( dto.getCheckstatus() != null ) {
            pcmTxfpsq.setCheckstatus( dto.getCheckstatus() );
        }
        if ( dto.getCzr() != null ) {
            pcmTxfpsq.setCzr( dto.getCzr() );
        }
        if ( dto.getFpsxsj() != null ) {
            pcmTxfpsq.setFpsxsj( dto.getFpsxsj() );
        }
        if ( dto.getPcmtxfpsqname() != null ) {
            pcmTxfpsq.setPcmtxfpsqname( dto.getPcmtxfpsqname() );
        }
        if ( dto.getBz() != null ) {
            pcmTxfpsq.setBz( dto.getBz() );
        }
        if ( dto.getZz() != null ) {
            pcmTxfpsq.setZz( dto.getZz() );
        }
        if ( dto.getYzw() != null ) {
            pcmTxfpsq.setYzw( dto.getYzw() );
        }
        if ( dto.getXygbh() != null ) {
            pcmTxfpsq.setXygbh( dto.getXygbh() );
        }
        if ( dto.getNl() != null ) {
            pcmTxfpsq.setNl( dto.getNl() );
        }
        if ( dto.getBmid() != null ) {
            pcmTxfpsq.setBmid( dto.getBmid() );
        }
        if ( dto.getYgbh() != null ) {
            pcmTxfpsq.setYgbh( dto.getYgbh() );
        }
        if ( dto.getPostaladdress() != null ) {
            pcmTxfpsq.setPostaladdress( dto.getPostaladdress() );
        }
        if ( dto.getYgw() != null ) {
            pcmTxfpsq.setYgw( dto.getYgw() );
        }
        if ( dto.getRank() != null ) {
            pcmTxfpsq.setRank( dto.getRank() );
        }
        if ( dto.getZzid() != null ) {
            pcmTxfpsq.setZzid( dto.getZzid() );
        }
        if ( dto.getTxdq() != null ) {
            pcmTxfpsq.setTxdq( dto.getTxdq() );
        }
        if ( dto.getLxdh() != null ) {
            pcmTxfpsq.setLxdh( dto.getLxdh() );
        }
        if ( dto.getBm() != null ) {
            pcmTxfpsq.setBm( dto.getBm() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmTxfpsq.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPcmprofileid() != null ) {
            pcmTxfpsq.setPcmprofileid( dto.getPcmprofileid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmTxfpsq.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmTxfpsq.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pcmTxfpsq.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pcmTxfpsq.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmTxfpsq.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrgid() != null ) {
            pcmTxfpsq.setOrgid( dto.getOrgid() );
        }
        if ( dto.getPcmtxfpsqid() != null ) {
            pcmTxfpsq.setPcmtxfpsqid( dto.getPcmtxfpsqid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmTxfpsq.setPimpersonname( dto.getPimpersonname() );
        }

        return pcmTxfpsq;
    }

    @Override
    public PcmTxfpsqDTO toDto(PcmTxfpsq entity) {
        if ( entity == null ) {
            return null;
        }

        PcmTxfpsqDTO pcmTxfpsqDTO = new PcmTxfpsqDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmTxfpsqDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmTxfpsqDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getFinished() != null ) {
            pcmTxfpsqDTO.setFinished( entity.getFinished() );
        }
        if ( entity.getCzrid() != null ) {
            pcmTxfpsqDTO.setCzrid( entity.getCzrid() );
        }
        if ( entity.getCheckstatus() != null ) {
            pcmTxfpsqDTO.setCheckstatus( entity.getCheckstatus() );
        }
        if ( entity.getCzr() != null ) {
            pcmTxfpsqDTO.setCzr( entity.getCzr() );
        }
        if ( entity.getFpsxsj() != null ) {
            pcmTxfpsqDTO.setFpsxsj( entity.getFpsxsj() );
        }
        if ( entity.getPcmtxfpsqname() != null ) {
            pcmTxfpsqDTO.setPcmtxfpsqname( entity.getPcmtxfpsqname() );
        }
        if ( entity.getBz() != null ) {
            pcmTxfpsqDTO.setBz( entity.getBz() );
        }
        if ( entity.getZz() != null ) {
            pcmTxfpsqDTO.setZz( entity.getZz() );
        }
        if ( entity.getYzw() != null ) {
            pcmTxfpsqDTO.setYzw( entity.getYzw() );
        }
        if ( entity.getXygbh() != null ) {
            pcmTxfpsqDTO.setXygbh( entity.getXygbh() );
        }
        if ( entity.getNl() != null ) {
            pcmTxfpsqDTO.setNl( entity.getNl() );
        }
        if ( entity.getBmid() != null ) {
            pcmTxfpsqDTO.setBmid( entity.getBmid() );
        }
        if ( entity.getYgbh() != null ) {
            pcmTxfpsqDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getPostaladdress() != null ) {
            pcmTxfpsqDTO.setPostaladdress( entity.getPostaladdress() );
        }
        if ( entity.getYgw() != null ) {
            pcmTxfpsqDTO.setYgw( entity.getYgw() );
        }
        if ( entity.getRank() != null ) {
            pcmTxfpsqDTO.setRank( entity.getRank() );
        }
        if ( entity.getZzid() != null ) {
            pcmTxfpsqDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getTxdq() != null ) {
            pcmTxfpsqDTO.setTxdq( entity.getTxdq() );
        }
        if ( entity.getLxdh() != null ) {
            pcmTxfpsqDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getBm() != null ) {
            pcmTxfpsqDTO.setBm( entity.getBm() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmTxfpsqDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPcmprofileid() != null ) {
            pcmTxfpsqDTO.setPcmprofileid( entity.getPcmprofileid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmTxfpsqDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmTxfpsqDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pcmTxfpsqDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pcmTxfpsqDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmTxfpsqDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrgid() != null ) {
            pcmTxfpsqDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getPcmtxfpsqid() != null ) {
            pcmTxfpsqDTO.setPcmtxfpsqid( entity.getPcmtxfpsqid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmTxfpsqDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return pcmTxfpsqDTO;
    }

    @Override
    public List<PcmTxfpsq> toDomain(List<PcmTxfpsqDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmTxfpsq> list = new ArrayList<PcmTxfpsq>( dtoList.size() );
        for ( PcmTxfpsqDTO pcmTxfpsqDTO : dtoList ) {
            list.add( toDomain( pcmTxfpsqDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmTxfpsqDTO> toDto(List<PcmTxfpsq> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmTxfpsqDTO> list = new ArrayList<PcmTxfpsqDTO>( entityList.size() );
        for ( PcmTxfpsq pcmTxfpsq : entityList ) {
            list.add( toDto( pcmTxfpsq ) );
        }

        return list;
    }
}
